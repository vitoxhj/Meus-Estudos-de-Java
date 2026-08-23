package estudosJava.javacore.Bintroduçãometodos.domain;

public class Calculadora {
    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1 + num2);
        System.out.println("-----------");
    }

    public void subtracaoDoisNumeros(int num1, int num2){
        System.out.println(num1 - num2);
        System.out.println("-----------");
    }

    public void multiplicacaoDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
        System.out.println("-----------");
    }
    
    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
    public void somaVarArgs(int... nums){
        int some = 0;
        for(int num: nums){
            some += num;
        }
        System.out.println(some);
    }
}
