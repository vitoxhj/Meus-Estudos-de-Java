package estudosJava.javacore.Minterface.test;
import estudosJava.javacore.Minterface.domain.Email;
import estudosJava.javacore.Minterface.domain.SMS;
import estudosJava.javacore.Minterface.domain.Whatsapp;

public class NotificacaoTest {
    public static void main(String[] args) {
        Email email = new Email();
        SMS sms = new SMS();
        Whatsapp whatsapp = new Whatsapp();

        email.enviar("Vaga de java junior");
        sms.enviar("Vaga de Python junior");
        whatsapp.enviar("Vaga de javascript junior");
    }
    
}
