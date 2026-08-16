package estudosJava.introducao.Operadores;

public class JavaExercicioCalculadoraDeNotas {
    public static void main(String[] args) {
        double note1 = 2;
        double note2 = 5;
        double note3 = 10;
        double some = note1 + note2 + note3;
        double media = some / 3;
        double difference = note3 - note1;
        double rest = some % 2;
        System.out.println("-----Calculador de média-----");
        System.out.println("Notas: "+note1+", "+note2+", "+note3);
        System.out.println("Soma: "+some);
        System.out.println("Média: "+media);
        System.out.println("Diferença: "+difference);
        System.out.println("Média em inteiro: "+(int) media);
        System.out.println("Resto da soma por 2: "+rest);
        System.out.println("---------------------------------");
    }

}
