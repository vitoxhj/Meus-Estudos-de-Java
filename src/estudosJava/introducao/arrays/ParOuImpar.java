package estudosJava.introducao.arrays;

public class ParOuImpar {
    public static void main(String[] args) {
        //Imprima a quantidade de numeros pares e impares de dentro da array
        int [] num = {12,5,235,15,6,327,346,44,68,346,834,674,323,257,34,84,36,6,5665,8,368,6};
        int countPar = 0;
        int countImpar = 0;
        for (int pos = 0; pos < num.length; pos++) {
            if (num[pos] % 2 == 0){
                countPar += 1;
            }else{
                countImpar += 1;
            }
        }
        System.out.println("Existe no total " + countPar + " numeros pares e " + countImpar + " numeros ímpares nesta array");
    }
    
}
