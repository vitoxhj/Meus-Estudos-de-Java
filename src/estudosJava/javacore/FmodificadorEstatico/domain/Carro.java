package estudosJava.javacore.FmodificadorEstatico.domain;

public class Carro {
    //Método estático
    private String name;
    private double maxSpeed;
    private static double limitSpeed = 250;

    public Carro(double maxSpeed, String name) {
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public void imprime(){
        System.out.println("Nome: "+this.name);
        System.out.println("Velocidade Máxima: "+this.maxSpeed);
        System.out.println("Velocidade limite: "+Carro.limitSpeed);
        System.out.println("------------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getLimitSpeed() {
        return Carro.limitSpeed;
    }

    public void setLimitSpeed(double limitSpeed) {
        Carro.limitSpeed = limitSpeed;
    }
    
}
