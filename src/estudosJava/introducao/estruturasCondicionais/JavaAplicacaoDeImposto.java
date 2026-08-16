package estudosJava.introducao.estruturasCondicionais;

public class JavaAplicacaoDeImposto {
    public static void main(String[] args) {
        double salary = 100000;
        double result;
        String porcentege;
        double finalSalary;
        if (salary <= 34712){
            result = salary * (9.70 / 100);
            porcentege = "9.70%";
            finalSalary = salary - result;
        }else if (salary > 34712 && salary <= 68507){
            result = salary * (37.35 / 100);
            porcentege = "37.35%";
            finalSalary = salary - result;
        }else{
            result = salary * (49.50 / 100);
            porcentege = "49.50%";
            finalSalary = salary - result;
        }
        System.out.println("Seu imposto é de "+porcentege);
        System.out.println("Você precisara pagar $"+result+" de imposto anual");
        System.out.println("Seu salario anual após os impostos é de $"+finalSalary);
    }
}
