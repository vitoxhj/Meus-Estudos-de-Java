package estudosJava.javacore.Kenums.test;

import estudosJava.javacore.Kenums.domain.Pedido;
import estudosJava.javacore.Kenums.domain.StatusPedido;

public class PedidoTest {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1);
        pedido.setStatusPedido(StatusPedido.CANCELADO);
        pedido.imprimir();
    }
    
}
