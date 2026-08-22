package estudosJava.introducao.arraysMultidimensionais;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 meses
        // 31, 28, 31, 30, 30 dias
        int [][] days = new int[3][3];
        days [0][0] = 67;
        days [0][1] = 100;
        days [0][2] = 18;
        days [1][0] = 43;
        days [1][1] = 54;
        days [1][2] = 90;
        days [2][0] = 11;
        days [2][1] = 10;
        days [2][2] = 15;
        for (int[] row : days) {
            for (int day : row) {
                System.out.print(day+", ");
            }
        }
        System.out.println("");
        for (int[] arrbase : days){
            for (int num : arrbase){
                System.out.print(num+", ");
            }
        }
        int[][] square = new int[1][1];
        int count = 1;
        for (int[]  cobe: square) {
            System.out.println("");
            for (int i : cobe) {
                System.out.println(i);
                System.out.print(count);
                count += 1;
            }
        }
    }
    
}