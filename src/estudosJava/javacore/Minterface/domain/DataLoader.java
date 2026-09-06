package estudosJava.javacore.Minterface.domain;

public interface DataLoader {
    void load();
    default void checker(){
        System.out.println("Fazendo checagem de permissões");
    }
}
