package estudosJava.javacore.Gassociação.domain;

public class Cliente {
    private String name;
    private String cpf;
    
    public Cliente(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public boolean validarCpf(){
        String validCpf = this.cpf;
        validCpf = validCpf.replaceAll("\\D", "");
        return !(validCpf.length() != 11 || validCpf.matches("^(\\d)\\1{10}$"));
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
