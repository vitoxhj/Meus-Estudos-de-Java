package estudosJava.javacore.Hherança.domain;

public class ProfessorHeranca extends Pessoa2 {
    private double salario;
    private String disciplina;

    public ProfessorHeranca(int idade, String nome, String disciplina, double salario) {
        super(idade, nome);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Sálario: R$"+this.salario);
        System.out.println("Disciplina: "+this.disciplina);
    }

    @Override
    public void acao(){
        System.out.println("O professor "+this.getNome()+" está dando aula de "+this.disciplina);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }


}
