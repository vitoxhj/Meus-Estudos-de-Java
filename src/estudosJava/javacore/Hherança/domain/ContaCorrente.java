package estudosJava.javacore.Hherança.domain;

public class ContaCorrente extends Conta {
    private double taxa;

    public ContaCorrente(int numero, double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }

    @Override
    public void sacar(double saque){
        super.sacar(saque);
        System.out.println("Taxa de R$5 foi aplicado");
        this.setTaxa(5);
        double total;
        total = this.getSaldo() -this.getTaxa();
        this.setSaldo(total);

    }

    @Override
    public void mostrarConta(){
        super.mostrarConta();
        System.out.println("Tipo: Conta Corrente");
        System.out.println("-------------------------");
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

}
