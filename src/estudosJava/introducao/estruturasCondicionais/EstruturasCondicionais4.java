package estudosJava.introducao.estruturasCondicionais;

public class EstruturasCondicionais4 {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando 1 como domingo
        byte day = 7;
        // char, int, byte, short, enum, String
        switch (day) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sabádo");
            default -> System.out.println("Opção invalida!");
        }
        char sex = 'F';
        switch (sex) {
            case 'M' -> System.out.println("Sexo masculino");
            case 'F' -> System.out.println("Sexo feminino");
            default -> System.out.println("Não é um sexo");
        }
    
    }
}
