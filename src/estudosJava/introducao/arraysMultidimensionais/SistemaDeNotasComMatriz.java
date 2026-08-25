package estudosJava.introducao.arraysMultidimensionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SistemaDeNotasComMatriz {
    public static void main(String[] args) {
        // Sistema de notas
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a quantidade de alunos");
            int quant = scanner.nextInt();

        double[][] notas = new double[quant][3];
        double[] mediasArray = new double[quant];
        int countnotas;
        int countalunos = 0;
            for (double[] nota : notas) {
                countalunos++;
                countnotas = 0;
                for (int j = 0; j < nota.length; j++) {
                    countnotas++;
                    System.out.println("Coloque a nota "+countnotas+" do aluno "+countalunos+": ");
                    nota[j] = scanner.nextDouble();  
                }
            }

        double media = 0;
        int approved = 0;
        int recup = 0;
        int reproved = 0;
        String status;
        System.out.println("=====RESULTADO=====");
        System.out.println("Notas digitadas:");
        countalunos = 0;
            System.out.println("                    P1  P2  P3    M    Status");
        for (int i = 0; i < quant; i++) {
            countalunos ++;
            double some = 0;
            System.out.println();
            System.out.print("Nota do aluno "+countalunos+":   ");
            for (int j = 0; j < notas[i].length; j++) {
                some += notas[i][j];
                System.out.print(""+notas[i][j]+"  ");
                if (j == notas[i].length - 1){
                    some /= notas[i].length;
                    mediasArray[i] = some;
                    if (some >= 7){
                        approved += 1;
                        status = "Aprovado";
                    }else if (some >= 5){
                        recup += 1;
                        status = "Recuperação";
                    }else{
                        reproved += 1;
                        status = "Reprovado";
                    }
                    System.out.print(""+decimalFormat.format(some)+"   "+status);
                }
                }
        }
        System.out.println();
        double maxMedia = 0;
        for (double i : mediasArray) {
            media += i;
            if (i > maxMedia){
                maxMedia = i;
            }
        }
        media = media / mediasArray.length;

        double max = 0;
        double min = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (i == 0){
                    max = notas[i][j];
                    min = notas[i][j];
                }
                if (notas[i][j] > max){
                    max = notas[i][j];
                }
                if (notas[i][j] < min){
                    min = notas[i][j];
                }
            }
            
        }
        
        System.out.println("Média da turma: "+decimalFormat.format(media));
        System.out.println("Maior média da sala: "+decimalFormat.format(maxMedia));
        System.out.println("Maior nota da sala: "+max);
        System.out.println("Menor nota da sala: "+min);
        System.out.println("Aprovados: "+approved);
        System.out.println("Recuperação: "+recup);
        System.out.println("Reprovados: "+reproved);
        }
    }
}
