package estudosJava.javacore.Npolimorfismo.domain;

import estudosJava.javacore.Npolimorfismo.service.Controle;

public class Celular implements Controle{

    @Override
    public void desligar() {
        System.out.println("Desligando celular");        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando celular");        
    }
    
}
