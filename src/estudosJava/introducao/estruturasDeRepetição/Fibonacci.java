package estudosJava.introducao.estruturasDeRepetição;

public class Fibonacci {
    public static void main(String[] args) {
        //Imprima a sequencia de Fibonacci
        int n2 = 1;
        int n1 = 0;
        int some;
        for (int i = 0; i <= 20; i++) {
            some = n1 + n2;
            n2 = n1;
            n1 = some;
            System.out.println(i + "°: "+some);
        }
    }    
}
