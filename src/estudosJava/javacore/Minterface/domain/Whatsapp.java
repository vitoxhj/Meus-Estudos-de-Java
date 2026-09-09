package estudosJava.javacore.Minterface.domain;

public class Whatsapp implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Mensagem enviada por whatsapp: "+mensagem);   
    }
    
}
    

