package estudosJava.javacore.LclassesAbstratas.domain;

public class Departamento {
    private FuncionarioAbstract[] funcionarios;
    
    public void adicionarFuncionario(FuncionarioAbstract funcionario){
        int tamanho = this.funcionarios == null ? 0 : this.funcionarios.length;

        FuncionarioAbstract[] arrayFuncionarios = new FuncionarioAbstract[tamanho + 1];
        if (this.funcionarios != null){
            System.arraycopy(this.funcionarios,0,arrayFuncionarios,0,this.funcionarios.length);
        }
        arrayFuncionarios[arrayFuncionarios.length - 1] = funcionario;
        this.setFuncionarios(arrayFuncionarios);
        
        System.out.println("Funcionario adicionado!");
        System.out.println("-------------------------------");
    }

    public void removerFuncionario(FuncionarioAbstract funcionario) {

    if (this.funcionarios == null || this.funcionarios.length == 0) {
        System.out.println("Não existem funcionários");
        return;
    }

    int indice = -1;

    for (int i = 0; i < funcionarios.length; i++) {
        if (funcionarios[i].name.equals(funcionario.name)
                && funcionarios[i].cargo().equals(funcionario.cargo())
                && funcionarios[i].salary == funcionario.salary) {

            indice = i;
            break;
        }
    }

    if (indice == -1) {
        System.out.println("Funcionário não encontrado");
        return;
    }

    FuncionarioAbstract[] novoArray =
            new FuncionarioAbstract[funcionarios.length - 1];

    for (int i = 0, j = 0; i < funcionarios.length; i++) {

        if (i != indice) {
            novoArray[j] = funcionarios[i];
            j++;
        }
    }

    this.setFuncionarios(novoArray);

    System.out.println("Funcionário removido!");
    System.out.println("-------------------------------");
}

    public void listarFuncionarios(){
        if (this.funcionarios == null || this.funcionarios.length == 0){
            System.out.println("Não existe funcionarios");
            return;
        }
        for (FuncionarioAbstract funcionario : this.funcionarios) {
            System.out.println("----- FUNCIONARIO -----");
            System.out.println("Cargo: "+funcionario.cargo());
            System.out.println("Nome: "+funcionario.name);
            System.out.println("Salário: R$"+funcionario.salary);
            System.out.println("-----------------------");
        }
    }

    public void folhaDePagamento(FuncionarioAbstract funcionario){
        System.out.println("----- FOLHA DE PAGAMENTO -----");
        System.out.println("Nome: "+funcionario.name);
        System.out.println("Cargo: "+funcionario.cargo());
        System.out.println("Sálario bruto: R$"+funcionario.salary);
        System.out.println("Bonus: "+funcionario.bonus()+"%");
        System.out.println("Salário com bonus: R$"+funcionario.calcularBonus());
        System.out.println("-------------------------------");
    }

    public FuncionarioAbstract[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(FuncionarioAbstract[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
