package estudosJava.javacore.LclassesAbstratas.test;

import estudosJava.javacore.LclassesAbstratas.domain.Car;
import estudosJava.javacore.LclassesAbstratas.domain.Motorcycle;
import estudosJava.javacore.LclassesAbstratas.domain.Truck;

public class VeiculosTest {
    public static void main(String[] args) {
        Car car = new Car("Peugot", "2005", 55000);
        Motorcycle motorcycle = new Motorcycle("BMY", "1200", 50000);
        Truck truck = new Truck("Scania", "R460", 1000000);

        car.mostrarDados();
        car.acelerar();
        car.freiar();

        motorcycle.mostrarDados();
        motorcycle.acelerar();
        motorcycle.freiar();

        truck.mostrarDados();
        truck.acelerar();
        truck.freiar();
    }
    
}
