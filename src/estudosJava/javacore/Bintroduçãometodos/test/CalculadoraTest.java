package estudosJava.javacore.Bintroduçãometodos.test;

import estudosJava.javacore.Bintroduçãometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(60,9);
        calculadora.subtracaoDoisNumeros(60, 9);
        calculadora.multiplicacaoDoisNumeros(60, 9);
        double div = calculadora.divideDoisNumeros(60, 0);
        System.out.println(div);

        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9,10);
    }
    
}
