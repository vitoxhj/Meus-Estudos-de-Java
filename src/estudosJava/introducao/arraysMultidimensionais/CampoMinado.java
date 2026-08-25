package estudosJava.introducao.arraysMultidimensionais;
import java.util.Scanner;

public class CampoMinado {
    public static void main(String[] args) {
        //Um campo minado em java
        char [][] camp = {
                        {'-','-','-','B','-'},
                        {'-','-','-','-','-'},
                        {'-','B','-','-','-'},
                        {'-','-','-','-','-'},
                        {'-','-','-','-','B'}};
        char [][] campView = {
                        {'-','-','-','-','-'},
                        {'-','-','-','-','-'},
                        {'-','-','-','-','-'},
                        {'-','-','-','-','-'},
                        {'-','-','-','-','-'}};
        System.out.println("Bem vindo ao campo minado!");
        System.out.println("\n    1c 2c 3c 4c 5c");
        int countv = 0;
        for (char[] cs : campView) {
            System.out.println();
            System.out.print(++countv+"l: ");
            for (char cs2 : cs) {
                System.out.print(cs2+ "  ");
            }
        }
        System.out.println();
        int collumLength = camp.length;
        int lineLenght = camp[0].length;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("===================");
            System.out.println("Escolha uma linha");
            int line = input.nextInt();
            System.out.println("Escolha uma coluna");
            int collum = input.nextInt();
            if ((collum > collumLength || collum > collumLength) || (line > lineLenght || line > lineLenght)){
                System.out.println("Linha ou coluna inexistente");
            }else{
                char casa = camp[line - 1][collum - 1];
                if (casa == 'B'){
                    System.out.println("BOOM!Você encontrou uma bomba");
                }else{
                    System.out.println("Casa livre!");
                }
            }
        }
        System.out.println("\n    1c 2c 3c 4c 5c");
        int count = 0;
        for (char[] cs : camp) {
            System.out.println();
            System.out.print(++count+"l: ");
            for (char cs2 : cs) {
                System.out.print(cs2+ "  ");
            }
        }
    }
    
}
