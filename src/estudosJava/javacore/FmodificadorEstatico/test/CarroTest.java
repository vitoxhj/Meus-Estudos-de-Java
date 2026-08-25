package estudosJava.javacore.FmodificadorEstatico.test;

import estudosJava.javacore.FmodificadorEstatico.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        //Método estático
        Carro c1 = new Carro(300, "Mustang");
        Carro c2 = new Carro(320, "Camaro");
        Carro c3 = new Carro(250, "Chevrolet");
        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
    
}
