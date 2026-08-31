package estudosJava.javacore.Hherança.domain;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected double velocidade;

    public Veiculo(String marca, String modelo, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar(){
        System.out.println("--- ACELERANDO O VEICULO ---");
    }

    public void freiar(){
        System.out.println("--- FREIANDO O VEICULO ---");

    }

    public void dados(){
        System.out.println("--- DADOS DO VEIULO ---");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Velocidade média: "+this.velocidade+"Km/h");
        System.out.println("-----------------------");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    
}
