package estudosJava.introducao.arraysMultidimensionais;

public class ElementosDaMatriz {
    public static void main(String[] args) {
        //Some os numeros da matriz
        int [][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int some = 0;
        int countl = 0;
        int max = 0;
        int min = 0;
        int par = 0;
        int impar = 0;
        for (int[] collum : matriz) {
            System.out.println("");
            for (int num : collum) {
                System.out.print(num+" ");
                if (countl == 0){
                    max = num;
                    min = num;
                }
                if (num > max){
                    max = num;
                }
                if (num < max){
                    min = num;
                }
                some += num;
                countl += 1;
                if (num % 2 == 0){
                    par += 1;
                }else{
                    impar += 1;
                }
            }
        }
        

        double media = some / countl;
        System.out.println("");
        System.out.println("Soma: "+some);
        System.out.println("Média: "+media);
        System.out.println("Maior: "+max);
        System.out.println("Menor: "+min);
        System.out.println("Números pares: "+par);
        System.out.println("Números ímpares: "+impar);
    }
    
}
