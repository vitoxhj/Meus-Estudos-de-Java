package estudosJava.javacore.Npolimorfismo.domain;

import estudosJava.javacore.Npolimorfismo.service.Animais;

public class Gato implements Animais {

    @Override
    public void emitirSom() {
        System.out.println("Miando!");        
    }
    
}
