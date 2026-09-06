package estudosJava.javacore.LclassesAbstratas.test;

import estudosJava.javacore.LclassesAbstratas.domain.Circulo;
import estudosJava.javacore.LclassesAbstratas.domain.Formas;
import estudosJava.javacore.LclassesAbstratas.domain.Quadrado;
import estudosJava.javacore.LclassesAbstratas.domain.Retangulo;
import estudosJava.javacore.LclassesAbstratas.domain.Triangulo;

public class FormasTest {
    public static void main(String[] args) {
        Formas[] formas = {
            new Circulo(6),
            new Quadrado(7),
            new Retangulo(6, 7),
            new Triangulo(6, 7, 6, 9)
        };

        for (Formas forma : formas) {
            forma.resultado();
        }
    }
}
