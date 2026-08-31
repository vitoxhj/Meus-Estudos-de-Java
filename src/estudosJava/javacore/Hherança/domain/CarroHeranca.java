package estudosJava.javacore.Hherança.domain;

public class CarroHeranca extends Veiculo {

    public CarroHeranca(String marca, String modelo, double velocidade) {
        super(marca, modelo, velocidade);
    }

    @Override
    public void acelerar(){
        super.acelerar();
        System.out.println("O carro "+this.marca+" está a "+this.velocidade+"Km/h");
        System.out.println("---------------------------------------------------");
    }

    @Override
    public void freiar(){
        super.freiar();
        System.out.println("O carro "+this.marca+" está freiando");
        System.out.println("---------------------------------------------------");
    }

    @Override
    public void dados(){
        super.dados();

    }
    
    
}
