package estudosJava.javacore.JmodificadorFinal.test;

import estudosJava.javacore.JmodificadorFinal.domain.CarroModificador;

public class CarroTest {
    public static void main(String[] args) {
        CarroModificador carro = new CarroModificador();
        //carro.COMPRADOR.setName("Vitox");
        System.out.println(carro.getVELOCIDADE_MAXIMA());
        System.out.println(carro.COMPRADOR);
    }
    
}
