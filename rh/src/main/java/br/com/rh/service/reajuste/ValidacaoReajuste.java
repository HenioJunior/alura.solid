package br.com.rh.service.reajuste;

import br.com.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento);
}
