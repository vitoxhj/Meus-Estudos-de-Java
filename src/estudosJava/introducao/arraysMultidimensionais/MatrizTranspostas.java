package estudosJava.introducao.arraysMultidimensionais;

public class MatrizTranspostas {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3},{4,5,6}};
        int line = matriz.length;
        int collum = matriz[0].length;
        int [][] newMatriz = new int[collum][line];

        for (int index = 0; index < line; index++) {
            for (int i = 0; i < collum; i++) {
                newMatriz[i][index] = matriz[index][i]; 
            }
        }

        for (int index = 0; index < collum; index++) {
            for (int i = 0; i < line; i++){
                System.out.print(newMatriz[index][i] + " ");
            }
            System.out.println();
        }
    }
}
