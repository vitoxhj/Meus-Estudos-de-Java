package estudosJava.javacore.Gassociação.domain;

public class Seminario {
    private String name;
    private Estudante[] estudantes;
    private ProfessorSem[] professores;
    private Local local;

    
    public Seminario(String name, Local local) {
        this.name = name;
        this.local = local;
    }
    

    public Seminario(String name, Local local, Estudante[] estudantes, ProfessorSem[] professores) {
        this.name = name;
        this.local = local;
        this.estudantes = estudantes;
        this.professores = professores;
        
    }


    public void imprimir(){
        System.out.println("Nome do seminario: "+this.name);
        System.out.println("Local: "+local.getLocal());
        System.out.println(" ## Professores ## \n");
        if (professores == null || professores.length == 0) return;
        for (ProfessorSem professor : professores) {
            System.out.println("Professor: "+professor.getName());
            System.out.println("Especialidade: "+professor.getArea());
            System.out.println("----------------------------");
        }
        System.out.println(" ## Estudantes ## \n");
        if (estudantes == null || estudantes.length == 0) return;
        for (Estudante estudante : estudantes) {
            System.out.println("Estudante: "+estudante.getName());
            System.out.println("idade: "+estudante.getAge());
            System.out.println("----------------------------");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Estudante[] getEstudantes() {
        return estudantes;
    }
    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
    public ProfessorSem[] getProfessores() {
        return professores;
    }
    public void setProfessores(ProfessorSem[] professores) {
        this.professores = professores;
    }
    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }
    
}
