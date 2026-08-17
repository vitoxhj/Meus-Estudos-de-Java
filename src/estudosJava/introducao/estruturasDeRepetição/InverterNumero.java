package estudosJava.introducao.estruturasDeRepetição;

public class InverterNumero {
    public static void main(String[] args) {
        //Imprima o numero invetido
        int num = 12345;
        int invertido = 0;
        while (num != 0){
            int digit = num % 10;
            invertido = invertido * 10 + digit;
            num /= 10;
        }
        System.out.println("Numero invertido: "+invertido);
    }
    
}
