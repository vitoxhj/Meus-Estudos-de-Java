package estudosJava.javacore.Bintroduçãometodos.test;

import estudosJava.javacore.Bintroduçãometodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.name = "Jose";
        funcionario1.age = 50;
        funcionario1.salarys = new double[]{1000,2000,3000};

        funcionario2.name = "Claudio";
        funcionario2.age = 40;
        funcionario2.salarys = new double[]{1555,2666,3777};
        

        funcionario3.name = "Maria";
        funcionario3.age = 40;
        funcionario3.salarys = new double[]{7000,8000,9000};
        

        funcionario1.imprime();
        funcionario2.imprime();
        funcionario3.imprime();
        funcionario1.media();
        funcionario2.media();
        funcionario3.media();
    }
    
}
