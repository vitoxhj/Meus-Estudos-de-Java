package estudosJava.javacore.Hherança.domain;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;
    
    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public void mostrarConta(){
        if (cliente.validarCpf() == false){
            System.out.println("O cpf do usúario é invalido");
            return;
        }
        System.out.println("========== CONTA ==========");
        System.out.println("Números: "+this.numero+"\n");
        System.out.println("Cliente: "+cliente.getName());
        System.out.println("CPF: "+cliente.getCpf()+"\n");
        System.out.println("Saldo: R$"+this.saldo);

    }

    public void depositar(double deposito){
        if (cliente.validarCpf() == false){
            System.out.println("O cpf do usúario é invalido");
            return;
        }
        if (deposito <= 0){
            System.out.println("Deposite no minimo 1 real");
            return;
        }
        this.saldo += deposito;
        System.out.println("Deposito de R$"+deposito+" concluido");
    }

    public void sacar(double sacar){
        if (cliente.validarCpf() == false){
            System.out.println("O cpf do usúario é invalido");
            return;
        }
        if (sacar > this.saldo){
            System.out.println("Saldo insuficiente");
            return;
        }else if (sacar <= 0){
            System.out.println("Saque no minimo 1 real");
            return;
        }
        this.saldo -= sacar;
        System.out.println("Saque de R$"+sacar+" concluido");
    }

    public void aplicarRendimento(){

    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
