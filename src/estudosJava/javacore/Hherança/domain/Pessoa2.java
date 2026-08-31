package estudosJava.javacore.Hherança.domain;

public class Pessoa2 {
    protected String nome;
    protected int idade;

    public Pessoa2(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    public void acao(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
