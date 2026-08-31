package estudosJava.javacore.Hherança.test;

import estudosJava.javacore.Hherança.domain.Guerreiro;
import estudosJava.javacore.Hherança.domain.Mago;
import estudosJava.javacore.Hherança.domain.Personagem;

public class ClassesJogo {
    public static void main(String[] args) {
        Personagem[] personagens = new Personagem[4];
        personagens[0] = new Guerreiro(50, 25, "Brutus", 1000);
        personagens[1] = new Mago(75, 35, "Rennala", 1000);
        personagens[2] = new Guerreiro(100, 50, "Leonidas", 2000);
        personagens[3] = new Mago(100, 55, "Geralt", 1500);

        for (Personagem personagem : personagens) {
            personagem.mostrarStatus();
            personagem.atacar();
            personagem.defender();
        }
        
    }
    
}
