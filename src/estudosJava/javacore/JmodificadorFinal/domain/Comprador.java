package estudosJava.javacore.JmodificadorFinal.domain;

public class Comprador {
    private String name = "Vitox";

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comprador{");
        sb.append("name=").append(name);
        sb.append('}');
        return sb.toString();
    }

}
