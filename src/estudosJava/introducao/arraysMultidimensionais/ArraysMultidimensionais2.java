package estudosJava.introducao.arraysMultidimensionais;

public class ArraysMultidimensionais2 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[10];
        arrayInt[1] = new int[20];
        arrayInt[2] = new int[30];
        int count = 0;
        for (int[] i : arrayInt) {
            for (int j: i) {
                System.out.println(j);
                count += 1;
            }
        }
        System.out.println(count);
    }
    
}
