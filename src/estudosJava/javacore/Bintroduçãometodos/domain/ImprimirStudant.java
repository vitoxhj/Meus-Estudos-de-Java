package estudosJava.javacore.Bintroduçãometodos.domain;

public class ImprimirStudant {
    public void imprimir (Studant studant){
        System.out.println("---------------------");
        System.out.println("Nome: "+studant.name);
        System.out.println("Idade: "+studant.age);
        System.out.println("Genero: "+studant.gender);
    }
    
}
