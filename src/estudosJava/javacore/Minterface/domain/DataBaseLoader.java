package estudosJava.javacore.Minterface.domain;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Caregando dados do banco de dados");
        
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
        
    }
    
}
