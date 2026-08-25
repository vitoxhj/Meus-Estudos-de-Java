package estudosJava.javacore.Dconstrutores.test;

import estudosJava.javacore.Dconstrutores.domain.Carros;

public class CarroTest {
    public static void main(String[] args) {
        //Imprima carros
        Carros carro1 = new Carros("Peugot", "2008", 2025,80000);
        carro1.viewPrice();
        Carros carro2 = new Carros("Honda", "Civic", 2015,45000);
        carro2.viewPrice();
        Carros carro3 = new Carros("Ford", "Mustang GT", 2026,500000);
        carro3.viewPrice();
    }
    
}
