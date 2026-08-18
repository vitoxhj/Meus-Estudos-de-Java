package estudosJava.introducao.arrays;

public class ParesEImpares {
    public static void main(String[] args) {
        //Separe os numeros pares dos impares
        int [] allNumbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        int [] par = new int[allNumbers.length / 2 + 1];
        int [] impar = new int[allNumbers.length / 2 + 1];
        int contp = 0;
        int conti = 0;
        for (int num : allNumbers) {
            if (num % 2 == 0){
                par[contp] = num;
                contp += 1;
            }else{
                impar[conti] = num;
                conti += 1;
            }
        }
        System.out.print("Todos os numeros: ");
        for (int i : allNumbers) {
            System.out.print(i+", ");
        }
        System.out.println("");
        System.out.print("Numeros pares: ");
        for (int i : par) {
            System.out.print(i+", ");
        }
        System.out.println("");
        System.out.print("numeros impares: ");
        for (int i : impar) {
            System.out.print(i+", ");
        }
    }
}
