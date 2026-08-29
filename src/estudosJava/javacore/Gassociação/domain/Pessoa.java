package estudosJava.javacore.Gassociação.domain;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;
    

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    public int validarIdade(){
        if (this.idade < 0) return 0;
        return this.idade;
    }

    public void imprimir(){
        System.out.println("--- DADOS PESSOAIS ---");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.validarIdade());
        System.out.println("--- DADOS LOCALIZAÇÃO ---");
        System.out.println("Estado: "+endereco.validarEstado());
        System.out.println("Cidade: "+endereco.getCidade());
        if (endereco.validarFormatoCEP(endereco.getCep()) == true){
            System.out.println("CEP: "+endereco.getCep());
        }else{
            System.out.println("CEP inválido ou indisponivel");
        }
        System.out.println("Rua: "+endereco.getRua());
        System.out.println("------------------------------");
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
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
