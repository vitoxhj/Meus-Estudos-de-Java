package estudosJava.javacore.Gassociação.test;

import estudosJava.javacore.Gassociação.domain.Cliente;
import estudosJava.javacore.Gassociação.domain.Conta;

public class SistemaBancarioTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Vyctor", "123456789-11");
        Conta conta1 = new Conta(1011, 1500, cliente1);
        conta1.depositar(1600);
        conta1.sacar(100);
        conta1.mostrarConta();
    }
    
}
