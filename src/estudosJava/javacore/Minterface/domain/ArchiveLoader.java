package estudosJava.javacore.Minterface.domain;

public class ArchiveLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando arquivo do banco de dados");
        
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivo do banco de dados");  
        
    }

}
