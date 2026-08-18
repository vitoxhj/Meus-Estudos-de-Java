package estudosJava.introducao.arrays;

public class CopiarUmArray {
    public static void main(String[] args) {
        int [] num1 = {10,20,30,40,50};
        int [] num2 = new int[num1.length];
        for (int i = 0; i < num1.length; i++) {
            num2[i] = num1[i];
            System.out.println("Array principal: "+num1[i]);
            System.out.println("Array copiado: "+num2[i]);
        }
    }
    
}
