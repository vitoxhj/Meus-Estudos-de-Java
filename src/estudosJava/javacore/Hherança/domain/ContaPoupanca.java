package estudosJava.javacore.Hherança.domain;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(int numero, double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }


    @Override
    public void aplicarRendimento(){
        this.setRendimento(10);
        System.out.println("Aplicando rendimento de "+this.getRendimento()+"%");
        double total;
        total = this.getSaldo() * (this.getRendimento() / 100);
        total += this.getSaldo();
        this.setSaldo(total);
        System.out.println("Rendimento aplicado");
        System.out.println("---------------------------");
    }

    @Override
    public void mostrarConta(){
        super.mostrarConta();
        System.out.println("Tipo: Conta Poupança");
    }
    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    
}
