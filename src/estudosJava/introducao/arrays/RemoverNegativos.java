package estudosJava.introducao.arrays;

public class RemoverNegativos {
    public static void main(String[] args) {
        //Faça um array que exclua os numeros negativos
        int [] nums = {10, -5, 20, -8, 30, -2, 40};
        System.out.print("Numeros positivos: ");
        for (int i : nums) {
            if (i >= 0){
                int [] positive = new int[i+1];
                positive[i] = i;
                System.out.print(positive[i]+", ");
            }
        }
    }
    
}
