package estudosJava.javacore.Hherança.domain;

public class DiretorHeranca extends Pessoa2 {
    private String escola;
    private double salario;

    public DiretorHeranca(int idade, String nome, String escola, double salario) {
        super(idade, nome);
        this.escola = escola;
        this.salario = salario;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Escola: "+ escola);
        System.out.println("Sálario: R$"+ salario);
    }

    @Override
    public void acao(){
        System.out.println("O diretor "+this.nome+" está gerenciando a escola "+this.escola);
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
