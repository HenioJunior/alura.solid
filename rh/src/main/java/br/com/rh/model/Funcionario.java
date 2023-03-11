package br.com.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Funcionario {

   private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public void atualizaSalario(BigDecimal novoSalario) {
        dadosPessoais.setSalario(novoSalario);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void promover(Cargo novoCargo) {
        dadosPessoais.setCargo(novoCargo);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "dadosPessoais=" + dadosPessoais +
                ", dataUltimoReajuste=" + dataUltimoReajuste +
                '}';
    }
}
