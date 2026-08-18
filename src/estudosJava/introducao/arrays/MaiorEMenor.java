package estudosJava.introducao.arrays;

public class MaiorEMenor {
    public static void main(String[] args) {
        //Imprima o maior e menor numeros de dentro da array
        int [] nums = {123,-123,12,54,65,35,7,42,7,35,7,346,83,6,53,78,45,84,85,37,4,7,2,57,23,5};
        int max = 0;
        int min = 0;
        for (int pos = 0; pos < nums.length; pos++) {
            if (pos == 0){
                max = nums[pos];
                min = nums[pos];
            }
            if (nums[pos] > max){
                max = nums[pos];
            }
            if (nums[pos] < min){
                min = nums[pos];
            }
        }
        System.out.println("O maior numero é " + max + " e o menor numeros é " + min);
    }
    
}
