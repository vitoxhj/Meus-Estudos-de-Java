package estudosJava.introducao.arrays;

public class ArrayDeNotas {
    public static void main(String[] args) {
    //Crie um array para armazenar as notas de 5 alunos.
    //1-Pedir as notas.
    //2-Mostrar todas as notas.
    //3-Calcular a média.
    //4-Mostrar a maior nota e menor nota.
    double [] notes = {10,8,7.5,8.5,5};
    byte option = 4;
    int choise = 3;

    switch (option) {
        case 1 -> System.out.println("Nota: "+notes[choise]);
        case 2 -> {
            for (double i : notes){
                System.out.println(i);
            }
        }
        case 3 -> {
        double result = 0;
        for (int pos = 0; pos < notes.length; pos++) {
            result += notes[pos];
        }
        result = result / notes.length;
        System.out.println("A média é: "+result);
    }
        case 4 -> {
        double max = 0;
        double min = 0;
        for (int pos = 0; pos < notes.length; pos++) {
            if (pos == 0){
                max = notes[pos];
                min = notes[pos];  
            }
            if (notes[pos] > max){
                max = notes[pos];
            }else if (notes[pos] < min){
                min = notes[pos];
            }
        }
        System.out.println("A maior nota é "+max+" e a menor nota é "+min);
    }
        default -> System.out.println("Opção indisponivel");
    }
}
}
