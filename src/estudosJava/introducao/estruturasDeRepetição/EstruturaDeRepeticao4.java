package estudosJava.introducao.estruturasDeRepetição;

public class EstruturaDeRepeticao4 {
    public static void main(String[] args) {
        double totalValue = 30000;
        for (int i = (int) totalValue; i >= 1; i--) {
            double parcelValue = totalValue / i;
            if (parcelValue < 1000){
                continue;
            }
            System.out.println("Parcela: " + i + ". Valor: R$"+ parcelValue);
        }
    }    
}
