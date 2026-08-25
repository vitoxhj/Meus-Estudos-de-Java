package estudosJava.javacore.EblocosDeInicialização.domain;

public class Anime {
    private String name;
    private int[] episodes;


    {
        this.episodes = new int[100];
        for (int i = 0; i < this.episodes.length; i++) {
            this.episodes[i] = i+1;
        }
    }
    
    public Anime(){
        
        for (int episode : this.episodes){
            System.out.print(episode+ " ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }
}
