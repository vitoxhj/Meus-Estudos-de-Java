package estudosJava.introducao.estruturasCondicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        //---Caixa Eletronico---
        //1-Listar saldo
        //2-Sacar
        //3-Depositar
        //4-Sair
        //Dinheiro no deposito
        double amount = 1000;
        //Dinheiro que ira fazer a transação
        double money = 5050;
        //Opção
        byte option = 6;
        switch (option) {
            case 1 -> System.out.println("Valor no banco: "+amount);
            case 2 -> {
                if (money > 0 && money <= amount && money % 10 == 0){
                    amount -= money;
                    System.out.println("Saque realizado com sucesso");
                    System.out.println("Valor no banco: "+amount);
                }else{
                    System.out.println("Não foi possivel terminar a transação");
                }
            }
            case 3 -> {
                if (money > 0){
                    amount += money;
                    System.out.println("Deposito realizado com sucesso");
                    System.out.println("Valor no banco: "+amount);
                }else{
                    System.out.println("Coloque um valor maior que 0");
                }
            }
            default -> System.out.println("Opção Invalida!");
        }
    }
}
