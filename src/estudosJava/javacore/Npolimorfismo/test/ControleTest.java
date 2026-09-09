package estudosJava.javacore.Npolimorfismo.test;

import estudosJava.javacore.Npolimorfismo.service.Controle;
import estudosJava.javacore.Npolimorfismo.domain.*;

public class ControleTest {
    public static void main(String[] args) {
        Controle[] controles = new Controle[3];

        controles[0] = new Televisao();
        controles[1] = new Celular();
        controles[2] = new Notebook();

        for (Controle controle : controles) {
            controle.ligar();
            controle.desligar();            
        }
    }
    
}
