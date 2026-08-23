package estudosJava.javacore.Bintroduçãometodos.domain;

public class Studant {
    public String name = null;
    public int age = 0;
    public char gender = 'n';
    public double[] notes = null;
    
    public void imprime(){
        System.out.println("\n---------------------");
        System.out.println("Nome: "+this.name);
        System.out.println("Idade: "+this.age);
        System.out.println("Genero: "+this.gender);
        System.out.print("Notas: ");
        for (double note: notes){
            System.out.print(note+", ");
        }
        this.status();
    }

    public double medias(){
        double media = 0;
        for (double note : notes){
            media += note;
        }
        media /= notes.length;
        System.out.println("\nMédia: "+(float)media);
        return media;
    }

    public void status(){
        double note = this.medias();
        String status;
        if (note >= 7){
            status = "Aprovado";
        }else if (note >= 5){
            status = "Recuperação";
        }else{
            status = "Reprovado";
        }
        System.out.println("Você está "+status);
    }
}
