package estudosJava.introducao.estruturasCondicionais;

public class NumeroPositivoOuNegativo {
    public static void main(String[] args) {
        //Informe se o numero é negativo ou positivo
        int num = 0;
        String type;
        if (num < 0){
            type = "Número negativo";
        }else if (num > 0){
            type = "Número positivo";
        }else{
            type = "Zero não tem tipo";
        }
        System.out.println("Número escolhido: "+num);
        System.out.println(type);
    }
}
