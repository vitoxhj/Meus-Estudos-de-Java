package estudosJava.introducao.TiposPrimitivos;

public class JavaProjectBiography {
    public static void main(String[] arg) {
        String name = "Vyctor";
        String dateOfBirth = "15/04/2008";
        String cityOfBirth = "Viradouro";
        String firstSchool = "COC";
        String city = "Arcoverde";
        String highSchool = "ETE";
        String curse = "Redes";
        int age = 18;
        String study = "java";
        String area = "ADS";
        double salary = 2455.56;
        String biography1 = "   "+name+" nasceu no dia "+dateOfBirth+" na cidade de "+cityOfBirth+", aos 1 ano ele já foi para a escola "+firstSchool+" e ficou nela até seus 8 anos até se mudar para outra escola.";
        String biography2 = "   Aos 11 anos ele se mudou para "+city+" e morou lá até os dias atuais.Ele fez o ensino médio na escola "+highSchool+" e consegui seu diploma e certificado de curso de "+curse+".";
        String biography3 = "   Nos nos dias atuais ele possui "+age+" anos e está estudando "+study+" e irá se ingressar na faculdade de "+area+" com uma pretensão salarial de R$"+salary+".";
        System.out.println("Biografia de "+name);
        System.out.println(biography1);
        System.out.println(biography2);
        System.out.println(biography3);
    }
}
