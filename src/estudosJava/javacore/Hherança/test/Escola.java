package estudosJava.javacore.Hherança.test;

import estudosJava.javacore.Hherança.domain.AlunoHeranca;
import estudosJava.javacore.Hherança.domain.DiretorHeranca;
import estudosJava.javacore.Hherança.domain.Pessoa2;
import estudosJava.javacore.Hherança.domain.ProfessorHeranca;

public class Escola {
    public static void main(String[] args) {
        Pessoa2[] pessoas = new Pessoa2[3];
        pessoas[0] = new AlunoHeranca(18, "Vitox", 12345,"Redes de computação");
        pessoas[1] = new ProfessorHeranca(35, "Jeferson", "Fisica", 5000);
        pessoas[2] = new DiretorHeranca(55, "Cleopatra", "Egipty School", 65000);
        for (Pessoa2 pessoa : pessoas) {
            pessoa.imprimir();
            pessoa.acao();
            System.out.println("----------------");
        }
    }
    
}
