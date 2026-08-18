package estudosJava.introducao.arrays;

public class AcessandoPosicoes {
    public static void main(String[] args) {
        //Imprima a primeira, segunda e ultima posição dos numeros da arrays
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        for (int pos = 0; pos < nums.length; pos++) {
            if (pos == 0){
                System.out.println("Primeiro: "+nums[pos]);
            }
            if (pos == 1){
                System.out.println("Segundo: "+nums[pos]);
            }
            if (pos == nums.length - 1){
                System.out.println("Ultimo: "+nums[pos]);
            }
        }
    }
    
}
