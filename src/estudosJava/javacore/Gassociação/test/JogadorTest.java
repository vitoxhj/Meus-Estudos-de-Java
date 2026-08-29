package estudosJava.javacore.Gassociação.test;

import estudosJava.javacore.Gassociação.domain.Jogador;
import estudosJava.javacore.Gassociação.domain.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Cristiano Ronaldo");
        Time time1 = new Time("Brasil");
        Time time2 = new Time("Argentina");
        Time time3 = new Time("Portugal");
        jogador1.setTime(time1);
        jogador2.setTime(time2);
        jogador3.setTime(time3);
        Jogador[] jogadores = {jogador1,jogador2,jogador3}; 
        for (Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
    
}
