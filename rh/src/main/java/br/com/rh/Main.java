package br.com.rh;

import br.com.rh.model.Cargo;
import br.com.rh.model.Funcionario;
import br.com.rh.service.reajuste.ReajusteService;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Funcionario alex = new Funcionario(
                "Alex",
                "111.111.111-11",
                Cargo.ANALISTA,
                new BigDecimal("1000"));

        ReajusteService service = new ReajusteService(new ArrayList<>());
        service.reajustarSalarioDoFuncionario(alex, new BigDecimal("400"));
     
        System.out.println(alex);
    }
}
