package estudosJava.introducao.estruturasCondicionais;

public class MaiorEntreTresNumeros {
    public static void main(String[] args) {
        //Receba três números e descubra qual é o maior.
        int num1 = 60;
        int num2 = 60;
        int num3 = 60;
        int max;
        if (num1 > num2 && num1 > num3){
            max = num1;
        }else if (num2 > num1 && num2 > num3){
            max = num2;
        }else if (num3 > num2 && num3 > num1){
            max = num3;
        }else{
            max = num1;
        }
        System.out.println("O maior número é "+max);
    }
}
