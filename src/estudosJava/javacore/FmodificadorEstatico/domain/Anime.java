package estudosJava.javacore.FmodificadorEstatico.domain;

public class Anime {

    public static void setEpisodes(int[] episodes) {
        Anime.episodes = episodes;
    }
    private String name;
    private static int[] episodes;


    static {
        System.out.println("Dentro do bloco de inicialização");
        Anime.episodes = new int[100];
        for (int i = 0; i < Anime.episodes.length; i++) {
            Anime.episodes[i] = i+1;
        }
    }
    
    public Anime(){
        
        for (int episode : Anime.episodes){
            System.out.print(episode+ " ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int[] getEpisodes() {
        return episodes;
    }

}
