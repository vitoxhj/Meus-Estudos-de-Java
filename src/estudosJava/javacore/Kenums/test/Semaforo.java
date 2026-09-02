package estudosJava.javacore.Kenums.test;

public enum Semaforo {
    VERMELHO,AMARELO,VERDE;

    public static void main(String[] args) {
        Semaforo cor1 = Semaforo.VERDE;
        Semaforo cor2 = Semaforo.AMARELO;
        Semaforo cor3 = Semaforo.VERMELHO;
        Semaforo[] cores = {cor1,cor2,cor3};

        for (Semaforo cor : cores) {
            switch (cor) {
                case VERMELHO -> System.out.println(cor.name()+" -> Pare!");
                case AMARELO -> System.out.println(cor.name()+" -> Aguarde!");
                case VERDE -> System.out.println(cor.name()+" -> Liberado!");
                default -> System.out.println("Cor inválida");
            }
        }
    }
}
