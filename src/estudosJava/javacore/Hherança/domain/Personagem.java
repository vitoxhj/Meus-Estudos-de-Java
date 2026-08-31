package estudosJava.javacore.Hherança.domain;

public class Personagem {
    protected String nome;
    protected int vida;
    protected int nivel;

    public Personagem(int nivel, String nome, int vida) {
        this.nivel = nivel;
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(){

    }

    public void defender(){

    }

    public void mostrarStatus(){
        System.out.println("=== STATUS ===");
        System.out.println("Nome: "+this.nome);
        System.out.println("Vida: "+this.vida);
        System.out.println("Nivel: "+this.nivel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
