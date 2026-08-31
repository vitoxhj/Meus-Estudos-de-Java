package estudosJava.javacore.Hherança.domain;

public class Guerreiro extends Personagem{
    private int forca;

    public Guerreiro(int forca, int nivel, String nome, int vida) {
        super(nivel, nome, vida);
        this.forca = forca;
    }

    @Override
    public void atacar(){
        System.out.println(this.getNome()+" atacou com sua espada");
        System.out.println("Dano: "+this.getForca());
        System.out.println("-------------------------------------");
    
    }

    @Override
    public void defender(){
        System.out.println(this.nome+" defendeu com seu escudo");
        System.out.println("-------------------------------------");
    }

    @Override
    public void mostrarStatus(){
        super.mostrarStatus();
        System.out.println("Classe: Guerreiro");
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }


}
