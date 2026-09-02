package estudosJava.javacore.Kenums.domain;

public enum ClienteTipo {
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica");

    private final int valor;
    private final String RELATORIO;

    ClienteTipo(int valor, String relatorio) {
        this.valor = valor;
        this.RELATORIO = relatorio;
    }

    public int getValor() {
        return valor;
    }

    public String getRELATORIO() {
        return RELATORIO;
    }
}
