package estudosJava.introducao.estruturasDeRepetição;

public class IgnorarMultiplosDe3 {
    public static void main(String[] args) {
        //Imprima numeros de 0 a 100 ignorando os multiplos de 100
        for (int num = 0; num <= 100; num++) {
            if (num % 3 == 0){
                continue;
            }
            System.out.println("Numero: "+num);
        } 
    }
    
}
