package estudosJava.introducao.arrays;
import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {
        // Sistema de notas
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a quantidade de alunos");
            int quant = scanner.nextInt();

        double[] notas = new double[quant];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Coloque a nota do aluno " + (i + 1));
            notas[i] = scanner.nextDouble();
        }

        double media = 0;
        int approved = 0;
        int recup = 0;
        int reproved = 0;
        int count = 1;
        System.out.println("=====RESULTADO=====");
        System.out.println("Notas digitadas:");
        for (double nota : notas) {
            System.out.println("Nota do aluno "+count+"°: "+nota);
            media += nota;
            if (nota >= 7){
                approved += 1;
            }else if (nota >= 5){
                recup += 1;
            }else{
                reproved += 1;
            }
            count += 1;
        }
        media = media / quant;

        double max = 0;
        double min = 0;
        for (int i = 0; i < notas.length; i++) {
            if (i == 0){
                max = notas[i];
                min = notas[i];
            }
            if (notas[i] > max){
                max = notas[i];
            }
            if (notas[i] < min){
                min = notas[i];
            }
        }
        System.out.println("Média da turma: "+media);
        System.out.println("Maior nota: "+max);
        System.out.println("Menor nota:"+min);
        System.out.println("Aprovados: "+approved);
        System.out.println("Recuperação: "+recup);
        System.out.println("Reprovados: "+reproved);

        }
    }
}
