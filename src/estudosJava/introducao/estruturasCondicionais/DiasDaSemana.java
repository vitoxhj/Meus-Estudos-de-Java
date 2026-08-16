package estudosJava.introducao.estruturasCondicionais;

public class DiasDaSemana {
    public static void main(String[] args) {
        //Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considere 1 como domingo
        byte day = 10;
        switch (day) {
            case 2,3,4,5,6 -> System.out.println("Dia útil");
            case 1,7 -> System.out.println("Fim de semana");
            default -> System.out.println("Opção inválida!");
        }
    }
}
