package estudosJava.javacore.JmodificadorFinal.domain;

public class CarroModificador {
    private String nome;
    private final double VELOCIDADE_MAXIMA = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public double getVELOCIDADE_MAXIMA() {
        return VELOCIDADE_MAXIMA;
    }

}
