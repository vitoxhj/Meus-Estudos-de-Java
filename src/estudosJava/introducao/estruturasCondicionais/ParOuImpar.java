package estudosJava.introducao.estruturasCondicionais;

public class ParOuImpar {
    public static void main(String[] args) {
        //Receba um número inteiro e informe se ele é par ou ímpar.
        double num = 18;
        double rest = num % 2;
        switch ((int)rest) {
            case 0 -> System.out.println("Este número é par");
            default -> System.out.println("Este número é ímpar");
        }
    }    
}
