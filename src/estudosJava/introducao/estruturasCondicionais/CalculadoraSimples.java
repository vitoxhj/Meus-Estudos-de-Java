package estudosJava.introducao.estruturasCondicionais;

public class CalculadoraSimples {
    public static void main(String[] args) {
        //Calculado Simples
        //Operações disponiveis: +, -, *, /
        double num1 = 0;
        double num2 = 10;
        String type = "/";
        double result;
        if (type == "-"){
            result = num1 - num2;
            System.out.println("Resultado: "+result);
        }else if (type == "+"){
            result = num1 + num2;
            System.out.println("Resultado: "+result);
        }else if (type == "*"){
            result = num1 * num2;
            System.out.println("Resultado: "+result);
        }else if (type == "/" && num2 != 0){
            result = num1 / num2;
            System.out.println("Resultado: "+result);
        }else if (num2 == 0 && type == "/"){
            System.out.println("Resultado: Não é possivel dividir por 0");
        }
    }
}
