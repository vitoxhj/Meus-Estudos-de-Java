package estudosJava.javacore.Hherança.domain;

public class AlunoHeranca extends Pessoa2 {
    private int matricula;
    private String curso;

    public AlunoHeranca(int idade, String nome, int matricula, String curso) {
        super(idade, nome);
        this.matricula = matricula;
        this.curso = curso;
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Curso: "+this.curso);
    }

    @Override
    public void acao(){
        System.out.println("O aluno "+this.nome+" está no curso de "+this.curso);
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    

}
