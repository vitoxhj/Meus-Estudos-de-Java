package estudosJava.javacore.Bintroduçãometodos.test;

import estudosJava.javacore.Bintroduçãometodos.domain.Studant;

public class StudantTest {
    public static void main(String[] args) {
        Studant studant = new Studant();
        Studant studant2 = new Studant();

        studant.name = "Senku";
        studant.age = 3500;
        studant.gender = 'M';
        studant.notes = new double[]{10,10,9.5};

        studant2.name = "Ochaco";
        studant2.age = 16;
        studant2.gender = 'F';
        studant2.notes = new double[]{7,5,5};

        studant.imprime();
        studant2.imprime();
    }
    
}
