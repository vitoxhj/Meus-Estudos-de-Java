package estudosJava.introducao.estruturasDeRepetição;

public class EstruturaDeRepeticao2 {
    public static void main(String[] args) {
        //Break
        //Imprima os 25 números de um dado valor
        for (int i = 0; i <= 100; i++) {
            if (i > 55){
                break;
            }
            System.out.println(i);
        }
    }    
}
