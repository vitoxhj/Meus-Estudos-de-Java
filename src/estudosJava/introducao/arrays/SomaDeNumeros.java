package estudosJava.introducao.arrays;

public class SomaDeNumeros {
    public static void main(String[] args) {
        //Some todos os numeros de uma arrays
        double [] nums = {12,25,32,34,56,67,75,81,94,102};
        double some = 0;
        for (int pos = 0; pos < nums.length ; pos++ ){
            some += nums[pos];
        }
        double media = some / nums.length;
        System.out.println("A soma dos numeros dentro da array é: "+some);
        System.out.println("A média deles é: "+media);
    }
    
}
