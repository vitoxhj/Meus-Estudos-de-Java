package estudosJava.introducao.estruturasDeRepetição;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println(count++);
        }
        do{
            System.out.println("Dentro do do while");
        }while (count < 10);
        for(int i=0; i < 101; i+=2){
            System.out.println("For: "+i);
        }
    }
}
