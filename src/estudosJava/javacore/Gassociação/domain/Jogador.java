package estudosJava.javacore.Gassociação.domain;

public class Jogador {
    private String name;
    private Time time;

    public void imprime(){
        System.out.println("Nome: "+this.name);
        if (this.time != null){
            System.out.println("Time: "+time.getName());
        }else{
            System.out.println("Este jogador não está em nehum time");
        }
        System.out.println("------------------------------------------");
    }

    public Jogador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
}
