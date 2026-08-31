package estudosJava.javacore.Hherança.test;

import estudosJava.javacore.Hherança.domain.Endereco;
import estudosJava.javacore.Hherança.domain.Funcionario;
import estudosJava.javacore.Hherança.domain.Pessoa;

public class Heranca {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 69");
        endereco.setCep("12345-101");

        Pessoa pessoa = new Pessoa("Vitox","123456789-12",endereco);
        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("Hokage",25000,"Naruto","091283054-87",endereco);
        funcionario.imprimir();
    }
    
}
