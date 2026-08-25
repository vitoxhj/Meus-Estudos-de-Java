package estudosJava.javacore.Dconstrutores.domain;

public class Carros {
    private String marca;
    private String modelo;
    private int ano;
    private double price;

    public Carros(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.imprimir();
    }
    public Carros(String marca, String modelo, int ano, double price){
        this(marca, modelo, ano);
        this.price = price;
    }

    private void imprimir(){
        System.out.println("Marca:" +this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano de lançamento: "+this.ano);
        System.out.println("--------------------------");
    }

    public void viewPrice(){
        System.out.println("Preço: R$"+this.price);
        System.out.println("--------------------------");
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
