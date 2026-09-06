package estudosJava.javacore.LclassesAbstratas.domain;

public abstract class FuncionarioAbstract {
    protected String name;
    protected double salary;
    protected String cargo;
    
    public FuncionarioAbstract(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract String cargo();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FuncionarioAbstract{");
        sb.append("name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    public abstract double calcularBonus();

    public abstract int bonus();
}
