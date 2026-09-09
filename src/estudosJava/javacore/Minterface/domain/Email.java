package estudosJava.javacore.Minterface.domain;

public class Email implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Mensagem enviada por email: "+mensagem);   
    }
    
}
    

