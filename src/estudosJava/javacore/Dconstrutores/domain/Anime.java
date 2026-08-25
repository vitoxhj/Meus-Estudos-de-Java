package estudosJava.javacore.Dconstrutores.domain;

public class Anime {
    //Construtor
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String description;
    private int indicativeAge;

    public Anime(String name, String type, int ep, String gender, String desc){
        this.name = name;
        this.type = type;
        this.episodes = ep;
        this.gender = gender;
        this.description = desc;
    }
    public Anime(String name, String type, int ep, String gender, String desc, int indicativeAge){
        this(name,type,ep,gender,desc);
        this.indicativeAge = indicativeAge;
    }

    public void imprimir(){
        System.out.println("Nome do anime: "+this.name);
        System.out.println("Tipo do anime: "+this.type);
        System.out.println("Episodios: "+this.episodes);
        System.out.println("Gerero do anime: "+this.gender);
        System.out.println("Descrição: "+this.description);
        System.out.println("Idade recomendada: "+this.indicativeAge);
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

    public int getIndicativeAge() {
        return indicativeAge;
    }

    public void setIndicativeAge(int indicativeAge) {
        this.indicativeAge = indicativeAge;
    }
    
}
