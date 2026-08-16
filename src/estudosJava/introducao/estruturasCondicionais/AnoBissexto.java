package estudosJava.introducao.estruturasCondicionais;

public class AnoBissexto {
    public static void main(String[] args) {
        //Divisivel por 4: pode ser bissexto
        //Divisivel por 100: não pode ser bissexto
        //Divisivel por 400: é bissexto
        double year = 1800;
        double div4 = year % 4;
        double div100 = year % 100;
        double div400 = year % 400;
        if ((div4 == 0 && div100 != 0) || (div400 == 0)){
            System.out.println("É bissexto");
        }else{
            System.out.println("Não é bissexto");
        }
    }    
}
