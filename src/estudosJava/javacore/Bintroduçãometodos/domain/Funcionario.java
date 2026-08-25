package estudosJava.javacore.Bintroduçãometodos.domain;

public class Funcionario {
    private String name;
    private int age;
    private double[] salarys;
    private double media = 0;
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
        
        for (double num: this.salarys){
            this.media += num;
        }
        double result = this.media / 3;
        System.out.println();
        System.out.println("A média salária de "+this.name+" é R$"+result);
        System.out.println("-------------------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalarys() {
        return salarys;
    }

    public void setSalarys(double[] salarys) {
        this.salarys = salarys;
    }
    
}
