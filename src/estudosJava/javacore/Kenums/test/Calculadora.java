package estudosJava.javacore.Kenums.test;

public enum Calculadora {
    SOMA{
        @Override
        public double calculo(double valor1, double valor2){
            return valor1 + valor2;
        }
    },
    SUBTRACAO{
        @Override
        public double calculo(double valor1, double valor2){
            return valor1 - valor2;
        }
    },
    MULTIPLICACAO{
        @Override
        public double calculo(double valor1, double valor2){
            return valor1 * valor2;
        }
    },
    DIVISAO{
        @Override
        public double calculo(double valor1, double valor2){
            if (valor2 != 0) return valor1 / valor2;
            return 0;   
        }
    };

    public abstract double calculo(double valor1, double valor2);

    public void imprimir(double valor1, double valor2){
        System.out.println("Nomero 1: " + valor1);
        System.out.println("Numero 2: "+ valor2);
        System.out.println("Operação: "+this.name()+"\n");
        System.out.println("Resultado: "+ calculo(valor1, valor2));
        System.out.println("---------------------------");
    }


    public static void main(String[] args) {
        Calculadora resultado1 = Calculadora.SOMA;
        Calculadora resultado2 = Calculadora.SUBTRACAO;
        Calculadora resultado3 = Calculadora.MULTIPLICACAO;  
        Calculadora resultado4 = Calculadora.DIVISAO;
        Calculadora[] resultados = {resultado1,resultado2,resultado3,resultado4};
        for (Calculadora calculadora : resultados) {
            calculadora.imprimir(67,69);
        }
    }
}
