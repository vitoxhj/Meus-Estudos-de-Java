package estudosJava.javacore.Npolimorfismo.domain;

import estudosJava.javacore.Npolimorfismo.service.Controle;

public class Televisao implements Controle{

    @Override
    public void desligar() {
        System.out.println("Desligando televisão");        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando televisão");        
    }
    
}
