package estudosJava.introducao.estruturasDeRepetição;

public class EstruturaDeRepeticao3 {
    //Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    //Condição valor da parcela >= 1000
    public static void main(String[] args) {
        double valueTotal = 40000;
        for (int parcel = 1; parcel <= valueTotal; parcel++) {
            double valueParcel = valueTotal / parcel;
            if (valueParcel < 1000) {
                break;
            }
            System.out.println("Parcela: " + parcel + ". Valor: R$" + valueParcel);
        }
    }
}
