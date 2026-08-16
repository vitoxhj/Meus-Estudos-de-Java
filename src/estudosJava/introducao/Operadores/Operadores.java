package estudosJava.introducao.Operadores;

public class Operadores {
    public static void main(String[] args) {
        //Operadores aritmetricos
        // + - / *
        double num1 = 10;
        double num2 = 20;
        double result = num1 / num2;
        System.out.println("O resultado de "+num1+" e "+num2+" é "+result);

        // Operadores resto
        // % 
        double resto = 20 % 3;
        System.out.println(resto);

        // Operadores relacionais
        // <, >, <=, >=, ==, !=
        boolean is10MaiorQue20 = 10 > 20;
        System.out.println(is10MaiorQue20);

        // Operadores logicos
        // && (AND), || (or), ! 
        int age = 25;
        float salary = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age >= 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valueAccountCorrent = 200;
        double valueAccountPoupance = 10000;
        double playstation5 = 5000;
        boolean buy = valueAccountCorrent >= playstation5 || valueAccountPoupance >= playstation5;
        System.out.println(buy);

        // Operadores de atribuição
        // +, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus +=  1000;
        System.out.println((int) bonus);
    }
}
