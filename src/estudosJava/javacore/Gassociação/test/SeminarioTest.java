package estudosJava.javacore.Gassociação.test;

import estudosJava.javacore.Gassociação.domain.Estudante;
import estudosJava.javacore.Gassociação.domain.Local;
import estudosJava.javacore.Gassociação.domain.ProfessorSem;
import estudosJava.javacore.Gassociação.domain.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        ProfessorSem professor1 = new ProfessorSem("Roberto", "Matematica");
        ProfessorSem professor2 = new ProfessorSem("Adalberta", "Portugues");
        ProfessorSem professor3 = new ProfessorSem("Fabiana", "Ciencias");
        ProfessorSem[] professores = {professor1,professor2,professor3};
        Estudante estudante1 = new Estudante("Vyctor", 18);
        Estudante estudante2 = new Estudante("Maria", 17);
        Estudante estudante3 = new Estudante("Jão", 21);
        Estudante estudante4 = new Estudante("Carlos", 20);
        Estudante estudante5 = new Estudante("Sabrina", 18);
        Estudante[] estudantes = {estudante1,estudante2,estudante3,estudante4,estudante5};
        Local local2 = new Local("Rua Jacinto Leite");
        Seminario seminario = new Seminario("Aprender o básico", local2, estudantes, professores);
        Seminario[] seminarios = {seminario};
        professor1.setSeminario(seminarios);
        professor2.setSeminario(seminarios);
        professor3.setSeminario(seminarios);

        seminario.imprimir();
    }
    
}
