package estudosJava.introducao.estruturasCondicionais;

public class Aprovacao {
    public static void main(String[] args) {
        //Informe se o aluno passou de ano
        double note1 = 10;
        double note2 = 8;
        double note3 = 9;
        double media = (note1 + note2 + note3) / 3;
        String status;
        String note;
        if (media >= 7){
            status = "Aprovado";
        }else if (media >= 5 && media < 7){
            status = "Recuperão";
        }else{
            status = "Reprovado";
        }
        if (media >= 9){
            note = "Excelente Desempenho!";
        }else if (media >= 7 && media < 9){
            note = "Bom Desempenho!";
        }else if (media >= 5 && media < 7){
            note = "Precisa Melhorar";
        }else{
            note = "Reprovado";
        }
        System.out.println("Média: "+media);
        System.out.println("Status: "+status);
        System.out.println("Nota: "+note);
    }
}
