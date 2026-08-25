package estudosJava.javacore.Dconstrutores.test;

import estudosJava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        //Construtor
        Anime anime = new Anime("Himouto!","TV",24,"Comédia","Um anime que conta o dia a dia de dois irmãos",10);
        anime.imprimir();
    }
    
}
