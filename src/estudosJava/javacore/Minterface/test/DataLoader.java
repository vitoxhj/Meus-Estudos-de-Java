package estudosJava.javacore.Minterface.test;

import estudosJava.javacore.Minterface.domain.ArchiveLoader;
import estudosJava.javacore.Minterface.domain.DataBaseLoader;

public class DataLoader {
    public static void main(String[] args) {
        DataBaseLoader base = new DataBaseLoader();
        ArchiveLoader archive1 = new ArchiveLoader();
        base.load();
        archive1.load();

        base.remove();
        archive1.remove();
    }
    
}
