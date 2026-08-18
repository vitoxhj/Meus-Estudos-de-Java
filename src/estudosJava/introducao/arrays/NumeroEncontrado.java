package estudosJava.introducao.arrays;

public class NumeroEncontrado {
    public static void main(String[] args) {
        //Peça um numero e verifique se ele esta na array
        int choise = 67;
        int [] nums = {1,2,3,4,5,6,7,8,9,10,0,67,0,10,9,8,7,6,5,4,3,2,1};
        String message = "Numero não encontrado!";
        int count = 0;
        for (int pos = 0; pos < nums.length; pos++) {
            count += 1;
            if (nums[pos] == choise){
                message = "O numero foi encontrado no indice "+count+" !";
                break;
            }
        }
        System.out.println(message);
    }
    
}
