package estudosJava.javacore.LclassesAbstratas.test;

import estudosJava.javacore.LclassesAbstratas.domain.Desenvolvedor;
import estudosJava.javacore.LclassesAbstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pain", 50000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Vitox", 15000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
    
}
