package estudosJava.introducao.arraysMultidimensionais;

public class LinhaEColunas {
    public static void main(String[] args) {
        //Some os numeros de cada linha e de cada coluna
        //Maior elemento de cada linha
        //Media de cada linha
        int[][] matriz = {{12,32,23},{44,55,66},{67,78,99}};
        int countl = 0;
        int somec1 = 0;
        int somec2 = 0;
        int somec3 = 0;
        for (int[] collum : matriz) {
            int somel = 0;
            countl += 1;
            int count = 0;
            int max = 0;
            int min = 0;
            for (int num : collum){   
                if (count == 0){
                    max = num;
                    min = num;
                }

                if (num > max){
                    max = num;
                }
                if (num < min){
                    min = num;
                }
                somel += num; 
                count += 1; 
                switch(count) {
                    case 1 -> somec1 += num;
                    case 2 -> somec2 += num;
                    case 3 -> somec3 += num;
                }
                if (count == collum.length){
                    double media;
                    media = somel / collum.length;
                    System.out.println("A soma dos numeros da linha "+countl+" é "+somel+" , a média é "+media+" , o menor números é "+min+" e o maior é "+max);
                }
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("A soma dos numeros da coluna 1 é "+somec1);
        System.out.println("A soma dos numeros da coluna 2 é "+somec2);
        System.out.println("A soma dos numeros da coluna 3 é "+somec3);
    }
    
}
