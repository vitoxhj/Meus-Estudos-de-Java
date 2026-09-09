package estudosJava.javacore.Npolimorfismo.service;

import estudosJava.javacore.Npolimorfismo.domain.Gato;
import estudosJava.javacore.Npolimorfismo.domain.Cachorro;

public class Animal {
    
    public static void fazerAnimalEmitirSom(Animais animal,int quantidade){
        if (animal == null) {
            return;
        }

        String type;
        if (animal instanceof Gato){
            type = "Gato";
        }else if (animal instanceof Cachorro){
            type = "Cachorro";
        }else{
            type = "Passáro";
        }
        System.out.print(quantidade + " " + type + "(s) estão ");
        animal.emitirSom();
        System.out.println("--------------------------------------");
    }
}
