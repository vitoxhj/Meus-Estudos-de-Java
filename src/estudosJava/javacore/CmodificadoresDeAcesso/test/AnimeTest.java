package estudosJava.javacore.CmodificadoresDeAcesso.test;

import estudosJava.javacore.CmodificadoresDeAcesso.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        //Sobrecarga de métodos
        Anime anime = new Anime();
        anime.init("Himouto!","TV",24,"Comédia","Um anime que conta o dia a dia de dois irmãos");
        anime.imprimir();
    }
    
}
