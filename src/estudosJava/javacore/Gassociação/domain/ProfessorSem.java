package estudosJava.javacore.Gassociação.domain;

public class ProfessorSem {
    private String name;
    private String area;
    private Seminario[] seminario;

    public ProfessorSem(String name, String area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
    
    
}
