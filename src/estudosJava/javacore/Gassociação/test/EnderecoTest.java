package estudosJava.javacore.Gassociação.test;

import estudosJava.javacore.Gassociação.domain.Endereco;
import estudosJava.javacore.Gassociação.domain.Pessoa;

public class EnderecoTest {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("piaui", "São Paulo", "12345-678", "Rua Machado de Assis");
        Pessoa pessoa = new Pessoa("Vitox", 18, endereco1);
        pessoa.imprimir();
    }
    
}
