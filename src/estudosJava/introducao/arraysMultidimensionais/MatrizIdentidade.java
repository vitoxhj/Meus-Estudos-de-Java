package estudosJava.introducao.arraysMultidimensionais;

public class MatrizIdentidade {
    public static void main(String[] args) {
        int [][] matriz = new int[5][5];
        int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j){
                    matriz[i][j] = 1;
                    System.out.print(matriz[i][j] + " ");
                    continue;
                }
                matriz[i][j] = 0;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] linha : matriz2) {
            for (int j = 0; j < linha.length; j++) {
                if (linha[j] % 2 == 0){
                    System.out.print(linha[j] + " ");
                }else{
                    linha[j] = 0;
                    System.out.print(linha[j] + " ");
                }
                
            }
            System.out.println();
        }
    }
}
