package estudosJava.javacore.CmodificadoresDeAcesso.test;

import estudosJava.javacore.CmodificadoresDeAcesso.domain.People;

public class PeopleTest {
    public static void main(String[] args) {
        //Modificadores setters e getters
        People people = new People();
        people.setName("Vyctor");
        people.setAge(18);

        System.out.println(people.getName());
        System.out.println(people.getAge());
    }
    
}
