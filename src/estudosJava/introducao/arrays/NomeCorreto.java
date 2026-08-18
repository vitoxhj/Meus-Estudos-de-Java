package estudosJava.introducao.arrays;

public class NomeCorreto {
    public static void main(String[] args) {
        //Imprima nomes e veja se ele está correto
        String [] names = {"Goku","Vegeta","Naruto","Neymar","Vyctor"};
        String loginName = "Luffy";
        String message = "Seu nome não está cadastrado";
        for (String name : names) {
            if (name.equals(loginName)) {
                message = "Seu nome está cadastrado";
                break;
            }
        }
        System.out.println(message);
    }
    
}
