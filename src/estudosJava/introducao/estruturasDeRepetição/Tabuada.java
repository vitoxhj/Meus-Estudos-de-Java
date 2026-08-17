package estudosJava.introducao.estruturasDeRepetição;

public class Tabuada {
    public static void main(String[] args) {
        //Tabuada
        int num = 8;
        for (int i = 0; i <= 10; i++) {
            int result = i * num;
            System.out.println(i + " x " + num + " = " + result);
        }
    }
    
}
