package estudosJava.javacore.Hherança.domain;

public class Mago extends Personagem{
    private int magia;

    public Mago(int magia, int nivel, String nome, int vida) {
        super(nivel, nome, vida);
        this.magia = magia;
    }

    @Override
    public void atacar(){
        System.out.println(this.getNome()+" atacou com sua magia de fogo");
        System.out.println("Dano: "+this.getMagia());
        System.out.println("-------------------------------------");
    
    }

    @Override
    public void defender(){
        System.out.println(this.nome+" defendeu com seu escudo mágico");
        System.out.println("-------------------------------------");
    }

    @Override
    public void mostrarStatus(){
        super.mostrarStatus();
        System.out.println("Classe: Mago");
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }


}
