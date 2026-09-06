package estudosJava.javacore.LclassesAbstratas.test;

import estudosJava.javacore.LclassesAbstratas.domain.Clt;
import estudosJava.javacore.LclassesAbstratas.domain.Freelancer;
import estudosJava.javacore.LclassesAbstratas.domain.Pj;

public class TrabalhadorTest {
    public static void main(String[] args) {
        Clt clt = new Clt("123.456.789-18", "Vitox", 5000);
        Pj pj = new Pj("912.363.268-17", "Java Company", 56000);
        Freelancer freelancer = new Freelancer("368.157.217-15", "Subaru", 555, 6);
        
        clt.calcularSalario();
        clt.trabalhar();

        pj.calcularSalario();
        pj.trabalhar();

        freelancer.calcularSalario();
        freelancer.trabalhar();
    }
}