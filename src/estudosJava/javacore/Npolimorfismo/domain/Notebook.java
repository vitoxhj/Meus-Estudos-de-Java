package estudosJava.javacore.Npolimorfismo.domain;

import estudosJava.javacore.Npolimorfismo.service.Controle;

public class Notebook implements Controle{

    @Override
    public void desligar() {
        System.out.println("Desligando notebook");
        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando notebook");        
    }
    
}
