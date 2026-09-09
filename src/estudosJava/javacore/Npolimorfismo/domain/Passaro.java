package estudosJava.javacore.Npolimorfismo.domain;

import estudosJava.javacore.Npolimorfismo.service.Animais;

public class Passaro implements Animais{

    @Override
    public void emitirSom() {
        System.out.println("Piando!");        
    }
    
}
