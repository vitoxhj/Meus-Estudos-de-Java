package estudosJava.javacore.Kenums.test;

import estudosJava.javacore.Kenums.domain.ClienteEnums;
import estudosJava.javacore.Kenums.domain.ClienteTipo;
import estudosJava.javacore.Kenums.domain.PagamentoTipo;

public class Cliente {
    public static void main(String[] args) {
        ClienteEnums cliente1 = new ClienteEnums("Vitox", ClienteTipo.PESSOA_FISICA);
        ClienteEnums cliente2 = new ClienteEnums("Jaison", ClienteTipo.PESSOA_JURIDICA);
        ClienteEnums cliente3 = new ClienteEnums("Thomas", ClienteTipo.PESSOA_FISICA);
        ClienteEnums cliente4 = new ClienteEnums("Kataguri", ClienteTipo.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(PagamentoTipo.DEBITO.calcularDesconto(100));
    }
    
}
