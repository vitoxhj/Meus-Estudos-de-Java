package estudosJava.javacore.LclassesAbstratas.domain;

public class Car extends VeiculoAbstract {

    public Car(String mark, String model, double price) {
        super(mark, model, price);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
        
    }

    @Override
    public void freiar() {
        System.out.println("O carro está freiando");
        
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo: Carro");
        System.out.println("------------------");
    }
    
}
