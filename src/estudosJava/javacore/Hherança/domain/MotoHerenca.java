package estudosJava.javacore.Hherança.domain;

public class MotoHerenca extends Veiculo {
    
    public MotoHerenca(String marca, String modelo, double velocidade) {
        super(marca, modelo, velocidade);
    }

    @Override
    public void acelerar(){
        super.acelerar();
        System.out.println("A moto "+this.marca+" está a "+this.velocidade+"Km/h");
        System.out.println("---------------------------------------------------");
    }

    @Override
    public void freiar(){
        super.freiar();
        System.out.println("A moto "+this.marca+" está freiando");
        System.out.println("---------------------------------------------------");
    }

    @Override
    public void dados(){
        super.dados();

    }
}
