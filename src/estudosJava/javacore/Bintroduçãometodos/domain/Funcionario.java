package estudosJava.javacore.Bintroduçãometodos.domain;

public class Funcionario {
    public String name;
    public int age;
    public double[] salarys;

    public void imprime(){
        System.out.println("\n---------------------------------");
        System.out.println("Nome: "+this.name);
        System.out.println("Idade: "+this.age);
        System.out.print("Salários: ");
        for (double num : this.salarys){
            System.out.print("R$"+num+", ");
        }
        System.out.println();
        

    }
    public void media(){
        double media = 0;
        for (double num: this.salarys){
            media += num;
        }
        double result = media / 3;
        System.out.println();
        System.out.println("A média salária de "+this.name+" é R$"+result);
        System.out.println("-------------------------------------");
    }
    
}
