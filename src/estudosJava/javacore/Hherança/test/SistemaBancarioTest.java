package estudosJava.javacore.Hherança.test;

import estudosJava.javacore.Hherança.domain.Cliente;
import estudosJava.javacore.Hherança.domain.Conta;
import estudosJava.javacore.Hherança.domain.ContaCorrente;
import estudosJava.javacore.Hherança.domain.ContaPoupanca;

public class SistemaBancarioTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Vitox", "123456789-18");
        Conta[] contas1 = new Conta[2];
        contas1[0] = new ContaCorrente(1234, 1000, cliente1);
        contas1[1] = new ContaPoupanca(1234, 1000, cliente1);
        
        contas1[0].depositar(1000);
        contas1[0].sacar(100);
        System.out.println("---------------------");
        contas1[1].depositar(1000);
        contas1[1].sacar(100);
        contas1[1].aplicarRendimento();
        for (Conta conta : contas1) {
            conta.mostrarConta();
        }
    }
    
}
