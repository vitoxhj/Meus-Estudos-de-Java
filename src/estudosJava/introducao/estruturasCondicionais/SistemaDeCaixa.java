package estudosJava.introducao.estruturasCondicionais;

public class SistemaDeCaixa {
    public static void main(String[] args) {
        //Um sistema de saque
        //O valor deve ser multiplo de 10
        double bank = 2000;
        double value = 1000;
        if (value > 0 && value <= bank && value % 10 == 0){
            value = bank - value;
            System.out.println("Saque realizado!");
            System.out.println("Novo saldo no banco: R$"+value);
        }else{
            System.out.println("Saque negado!");
        }
    }
}
