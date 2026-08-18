package estudosJava.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
    // byte, short, long, int, float, double = 0
    // char '\u0000' = ''
    // boolean = false
    // String = null

        String [] names = new String[10];
        names[0] = "Vyctor";
        names[1] = "Vitox";
        names[2] = "Vyctorhj";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);            
        }
    }
    
}
