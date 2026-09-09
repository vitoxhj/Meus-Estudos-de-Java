package estudosJava.javacore.Npolimorfismo.test;

import estudosJava.javacore.Npolimorfismo.domain.GerentePoli;
import estudosJava.javacore.Npolimorfismo.domain.TecnicoPoli;
import estudosJava.javacore.Npolimorfismo.service.FuncionarioPolimorfismo;
import estudosJava.javacore.Npolimorfismo.domain.Desenvolvedor;


public class FuncionarioTest {
    public static void main(String[] args) {
        FuncionarioPolimorfismo funcionario1 = new Desenvolvedor("Vitox",5000);
        FuncionarioPolimorfismo funcionario2 = new GerentePoli("Cleber",10000);
        FuncionarioPolimorfismo funcionario3 = new TecnicoPoli("Fabio",2500);
        FuncionarioPolimorfismo[] funcionarios = {funcionario1, funcionario2, funcionario3};

        for (FuncionarioPolimorfismo funcionario : funcionarios) {
            funcionario.trabalhar();
            funcionario.mostrarBonificacao();
        }
    }
    
}
