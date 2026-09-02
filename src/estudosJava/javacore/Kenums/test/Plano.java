package estudosJava.javacore.Kenums.test;

public enum Plano {
    BASICO(10),
    INTERMEDIARIO(30),
    PREMIUM(75);

    private double valor;

    Plano(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {
        Plano plano1 = Plano.BASICO;
        Plano plano2 = Plano.INTERMEDIARIO;
        Plano plano3 = Plano.PREMIUM;

        System.out.println(plano1.name() + " -> R$" + plano1.getValor());
        System.out.println(plano2.name() + " -> R$" + plano2.getValor());
        System.out.println(plano3.name() + " -> R$" + plano3.getValor());
    }

}
