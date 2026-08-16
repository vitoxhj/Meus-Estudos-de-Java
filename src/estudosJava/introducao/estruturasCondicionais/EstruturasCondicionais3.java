package estudosJava.introducao.estruturasCondicionais;

public class EstruturasCondicionais3 {
    public static void main(String[] args) {
        double salary = 1600;
        String donate = "Vou doar para a caridade";
        String notDonate = "Não posso doar para a caridade, sou pobre :(";
        String result = (salary >= 5000) ? donate : notDonate;
        System.out.println(result);
    }
}
