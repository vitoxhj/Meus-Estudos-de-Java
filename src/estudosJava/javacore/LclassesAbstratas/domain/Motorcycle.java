package estudosJava.javacore.LclassesAbstratas.domain;

public class Motorcycle extends VeiculoAbstract{

    public Motorcycle(String mark, String model, double price) {
        super(mark, model, price);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
        
    }

    @Override
    public void freiar() {
        System.out.println("A moto está freiando");
        
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo: Moto");
        System.out.println("------------------");
    }
    
}
