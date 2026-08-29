package estudosJava.javacore.Gassociação.test;

import estudosJava.javacore.Gassociação.domain.Escola;
import estudosJava.javacore.Gassociação.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Escola escola = new Escola("Escola João Campos");
        Professor professor1 = new Professor("Guanabara");
        Professor professor2 = new Professor("Jiraya");
        Professor professor3 = new Professor("Claudio");
        Professor professor4 = new Professor("Kakashi");
        Professor[] professores = {professor1, professor2, professor3, professor4};
        escola.setProfessor(professores);
        escola.imprime();
    }
    
}
