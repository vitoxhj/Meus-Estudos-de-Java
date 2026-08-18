package estudosJava.introducao.arrays;

public class SegundaMaiorNota {
    public static void main(String[] args) {
        //Imprima o maior e e a segundo maior numero de dentro da array
        int [] nums = {123,-123,12,54,65,35,7,42,7,35,7,346,83,6,53,78,45,84,85,37,4,7,2,57,23,5};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > max){
                max2 = max;
                max = i;
            }else if (i > max && i != max){
                max2 = i;
            }
        }
        System.out.println("O maior numero é " + max + " e o segundo maior numero é " + max2);
    }
    
}
