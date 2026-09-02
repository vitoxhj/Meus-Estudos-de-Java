package estudosJava.javacore.Kenums.domain;

public class ClienteEnums {
    private String nome;
    private ClienteTipo clienteTipo;

    public ClienteEnums(String nome, ClienteTipo clienteTipo) {
        this.clienteTipo = clienteTipo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClienteTipo getClienteTipo() {
        return clienteTipo;
    }

    public void setClienteTipo(ClienteTipo clienteTipo) {
        this.clienteTipo = clienteTipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClienteEnums{");
        sb.append("nome=").append(nome);
        sb.append(", clienteTipo=").append(clienteTipo.getRELATORIO());
        sb.append(", clienteValor=").append(clienteTipo.getValor());
        sb.append('}');
        return sb.toString();
    }

}