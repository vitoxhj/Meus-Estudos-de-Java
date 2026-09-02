package estudosJava.javacore.Kenums.domain;

public class Pedido {
    private int id;
    private StatusPedido statusPedido;

    public Pedido(int id) {
        this.id = id;
    }

    public void imprimir(){
        System.out.println("ID: "+id);
        System.out.println("Status: "+statusPedido.name());
    }


    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
