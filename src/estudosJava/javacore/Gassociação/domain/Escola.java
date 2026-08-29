package estudosJava.javacore.Gassociação.domain;

public class Escola {
    private String name;
    private Professor[] professores;

    public Escola(String name) {
        this.name = name;
    }

    public Escola(String name, Professor[] professores) {
        this.name = name;
        this.professores = professores;
    }


    public void imprime(){
        System.out.println("Nome da escola: "+this.name);
        if (professores == null) return;
        System.out.print("Professores: ");
        for (Professor professor : professores) {
            System.out.print(professor.getName()+", ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessor() {
        return professores;
    }

    public void setProfessor(Professor[] professores) {
        this.professores = professores;
    }
}
