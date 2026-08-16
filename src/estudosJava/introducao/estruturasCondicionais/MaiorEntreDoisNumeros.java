package estudosJava.introducao.estruturasCondicionais;

public class MaiorEntreDoisNumeros {
    public static void main(String[] args) {
        //Imprima o maior numero entre dois numeros
        int num1 = 10;
        int num2 = 10;
        if (num1 > num2){
            System.out.println("O maior número é "+num1);
        }else if (num2 > num1){
            System.out.println("O maior número é "+num2);
        }else{
            System.out.println(num1+" e "+num2+" são iguais");
        }
    }
}
