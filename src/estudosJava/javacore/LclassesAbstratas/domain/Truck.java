package estudosJava.javacore.LclassesAbstratas.domain;

public class Truck extends VeiculoAbstract{

    public Truck(String mark, String model, double price) {
        super(mark, model, price);
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando");
        
    }

    @Override
    public void freiar() {
        System.out.println("O caminhão está freiando");
        
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo: Caminhão");
        System.out.println("------------------");
    }
    
}
