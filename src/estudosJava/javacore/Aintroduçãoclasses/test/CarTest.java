package estudosJava.javacore.Aintroduçãoclasses.test;

import estudosJava.javacore.Aintroduçãoclasses.domain.CarType;
public class CarTest {
    public static void main (String[] args){
        CarType Honda = new CarType();
        CarType Peugot = new CarType();
        Honda.name = "Honda";
        Honda.model = "Advenced hibrid";
        Honda.date = 2020;
        Peugot.name = "Peugot";
        Peugot.model = "2008";
        Peugot.date = 2025;
        System.out.println("Nome: "+Honda.name);
        System.out.println("Modelos: "+Honda.model);
        System.out.println("Ano de lançamento: "+Honda.date);
        System.out.println("Nome: "+Peugot.name);
        System.out.println("Modelos: "+Peugot.model);
        System.out.println("Ano de lançamento: "+Peugot.date);
    }
}
