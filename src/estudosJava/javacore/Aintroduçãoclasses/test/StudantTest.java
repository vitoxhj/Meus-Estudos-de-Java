package estudosJava.javacore.Aintroduçãoclasses.test;

import estudosJava.javacore.Aintroduçãoclasses.domain.Studant;

public class StudantTest {
    public static void main(String[] args) {
        Studant studant = new Studant();
        studant.age = 18;
        studant.name = "Vyctor";
        studant.gender = 'M';
        System.out.println(studant.name);
        System.out.println(studant.age);
        System.out.println(studant.gender);
    }
}
