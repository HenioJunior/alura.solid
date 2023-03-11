package br.com.rh.service.reajuste;

import br.com.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {

        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        ValidacaoReajuste validacaoReajuste = new ValidacaoPercentualReajuste();
        validacaoReajuste.validar(funcionario, aumento);
        if(funcionario.getDataUltimoReajuste() != null) {
            ValidacaoReajuste validacaoPeriodicidade = new ValidacaoPeridiocidadeEntreReajustes();
            validacaoPeriodicidade.validar(funcionario, aumento);
        }

        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizaSalario(salarioReajustado);
    }
}
