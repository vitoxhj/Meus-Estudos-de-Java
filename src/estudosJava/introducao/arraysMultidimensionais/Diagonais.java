package estudosJava.introducao.arraysMultidimensionais;

public class Diagonais {
    public static void main(String[] args) {
        //Some as duas diagonais da matriz
        //A media das duas diagonais
        int[][] matriz = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9 ,10,11,12},
        {15,14,15,20}};
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int count = 1;
        for (int index = 0; index < matriz.length; index++){
            leftDiagonal += matriz[index][index];
            rightDiagonal += matriz[index][matriz[index].length - count];
            count += 1;
        }
        
        double leftmedia = (double) leftDiagonal / (double) matriz.length;
        double rightmedia = rightDiagonal / matriz.length; 
        System.out.println("A soma da diagonal esquerda é "+leftDiagonal+" e a média é "+leftmedia);
        System.out.println("A soma da diagonal direita é "+rightDiagonal+" e a média é "+rightmedia);
    }
    
}
