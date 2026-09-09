package estudosJava.javacore.Minterface.domain;

public class SMS implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Mensagem enviada por Email: "+mensagem);   
    }
    
}
