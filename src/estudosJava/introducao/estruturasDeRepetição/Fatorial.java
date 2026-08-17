package estudosJava.introducao.estruturasDeRepetição;

public class Fatorial {
    public static void main(String[] args) {
        //Imprima o fatorial de um numero
        int num = 4;
        int some = 1;
        for (int factorial = num; factorial > 0 ; factorial--){
            some *= factorial;
            System.out.println(some);
            
        }
        
    }
    
}
