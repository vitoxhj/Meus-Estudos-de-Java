package estudosJava.javacore.CmodificadoresDeAcesso.domain;

public class Anime {
    //Sobrecarga de métodos
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String description;

    public void init(String name, String type, int ep){
        this.name = name;
        this.type = type;
        this.episodes = ep;
    }

    public void init(String name, String type, int ep, String gender, String desc){
        this.init(name, type, ep);
        this.gender = gender;
        this.description = desc;
    }
    public void imprimir(){
        System.out.println("Nome do anime: "+this.name);
        System.out.println("Tipo do anime: "+this.type);
        System.out.println("Episodios: "+this.episodes);
        System.out.println("Gerero do anime: "+this.gender);
        System.out.println("Descrição: "+this.description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }
    
}
