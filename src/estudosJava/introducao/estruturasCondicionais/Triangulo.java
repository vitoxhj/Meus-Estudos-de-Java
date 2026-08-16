package estudosJava.introducao.estruturasCondicionais;

public class Triangulo {
    public static void main(String[] args) {
        //Tipo do triangulo
        //3 lados iguais       → Equilátero
        //2 lados iguais       → Isósceles
        //3 lados diferentes   → Escaleno
        double l1 = 10;
        double l2 = 11;
        double l3 = 11;

        //Descubir o maior
        if (l1 + l2 > l3 &&
            l1 + l3 > l2 &&
            l2 + l3 > l1
        ){
            if (l1 == l2 && l1 == l3){
                System.out.println("Isso é um triangulo Equilátero");
            }else if (l1 == l2 || l1 == l3 || l2 == l3){
                System.out.println("Isso é um triangulo Isósceles");
            }else{
                System.out.println("Isso é um triangulo Escaleno");
            }
        }else{
            System.out.println("Não é possivel formar um triangulo com essas medidas");
        }
        
    }    
}
