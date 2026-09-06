package estudosJava.javacore.LclassesAbstratas.test;

import estudosJava.javacore.LclassesAbstratas.domain.Departamento;
import estudosJava.javacore.LclassesAbstratas.domain.Desenvolvedor;
import estudosJava.javacore.LclassesAbstratas.domain.FuncionarioAbstract;
import estudosJava.javacore.LclassesAbstratas.domain.Gerente;

import estudosJava.javacore.LclassesAbstratas.domain.Vendedor;

public class DepartamentoTest {
    public static void main(String[] args) {
        Departamento departamento = new Departamento();
        Gerente gerente1 = new Gerente("Tokito", 10000);
         Gerente gerente2 = new Gerente("Miku", 10000);
         Desenvolvedor desenvolvedor1 = new Desenvolvedor("Giran", 4500);
         Desenvolvedor desenvolvedor2 = new Desenvolvedor("Carol", 6000);
         Desenvolvedor desenvolvedor3 = new Desenvolvedor("Jiraya", 6500);
         Vendedor vendedor1 = new Vendedor("Fabia", 1500);
         Vendedor vendedor2 = new Vendedor("Hinata", 2000);
         Vendedor vendedor3 = new Vendedor("Joze", 2500);
         Vendedor vendedor4 = new Vendedor("Senku", 3000);
         Vendedor vendedor5 = new Vendedor("Yuji", 3500);
         FuncionarioAbstract[] funcionarios = {gerente1,gerente2,desenvolvedor1,desenvolvedor2,desenvolvedor3,
            vendedor1,vendedor2,vendedor3,vendedor4,vendedor5
         };

         for (FuncionarioAbstract funcionario : funcionarios) {
            departamento.adicionarFuncionario(funcionario);
         }

         departamento.removerFuncionario(vendedor3);
         departamento.removerFuncionario(gerente1);
         departamento.removerFuncionario(desenvolvedor3);


         departamento.listarFuncionarios();

         departamento.folhaDePagamento(vendedor5);
         departamento.folhaDePagamento(vendedor1);
         departamento.folhaDePagamento(gerente2);
         departamento.folhaDePagamento(desenvolvedor1);


    }
    
}
