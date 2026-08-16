package estudosJava.introducao.Operadores;

public class JavaExercicioQuantoTempoVoceJaViveu {
    public static void main(String[] args) {
        double age = 18;
        double months = age * 12;
        double days = months * 30;
        double hours = days * 24;
        double minutes = hours * 60;
        double seconds = minutes * 60;
        System.out.println("---Quanto tempo aproxidamente você já viveu---");
        System.out.println("Idade: "+age);
        System.out.println("Você já viveu "+(int)months+" meses.");
        System.out.println("Você já viveu "+(int)days+" dias.");
        System.out.println("Você já viveu "+(int)hours+" horas.");
        System.out.println("Você já viveu "+(int)minutes+" minutos.");
        System.out.println("Você já viveu "+(int)seconds+" segundos.");
    }
}
