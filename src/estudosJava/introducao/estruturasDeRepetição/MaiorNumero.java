package estudosJava.introducao.estruturasDeRepetição;

public class MaiorNumero {
    public static void main(String[] args) {
        //Maior numero
        int num1 = 10;
        int num2 = 2;
        int num3 = 35;
        int num4 = 22;
        int num5 = 5;
        int max = 0;
        for (int i = 0; i <= 100; i++) {
            if (i == num1){
                max = i;
            }else if (i == num2){
                max = i;
            }else if (i == num3){
                max = i;
            }else if (i == num4){
                max = i;
            }else if (i == num5){
                max = i;
            }
        }
        System.out.println("Maior número: "+max);
    }
}
