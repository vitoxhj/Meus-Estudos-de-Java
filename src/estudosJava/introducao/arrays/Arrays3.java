package estudosJava.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        String [] name = {"Vitox","Maria","João","Goku","Vegeta","Naruto","Luffy"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        for (String i : name)
            System.out.println(i);
    }
    
}
