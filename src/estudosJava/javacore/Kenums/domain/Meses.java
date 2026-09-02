package estudosJava.javacore.Kenums.domain;

public enum Meses {
    JANEIRO(31),
    FEVEREIRO(28),
    MARCO(31), 
    ABRIL(30), 
    MAIO(31), 
    JUNHO(30), 
    JULHO(31), 
    AGOSTO(31), 
    SETEMBRO(30), 
    OUTUBRO(30), 
    NOVEMBRO(30), 
    DEZEMBRO(31);

    private final int DIASTOTAL;

    
    Meses(int diasTotal) {
        this.DIASTOTAL = diasTotal;
    }


    public void imprimir(){
        System.out.println("Mês: " + this.toString());
        System.out.println("Dias totais: "+this.getDIASTOTAL());
    }

    

    public int getDIASTOTAL() {
        return DIASTOTAL;
    }

}
