package estudosJava.introducao.estruturasCondicionais;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {
        int age = 30;
        String category;
        if (age < 15){
            category = "Classe Infantil";
        }else if (age > 15 && age < 18){
            category = "Classe Juvenil";
        }else{
            category = "Classe Adulta";
        }
        System.out.println(category);
    }
}
