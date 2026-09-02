package estudosJava.javacore.Kenums.test;

public enum Status {
    ONLINE{
        @Override
        public String description(){
            return "Usuario online";
        }
    },
    OFFLINE{
        @Override
        public String description(){
            return "Usuario offline";
        }
    },
    BLOCKED{
        @Override
        public String description(){
            return "Usuario bloquiado";
        }
    };

    public abstract String description();

    public static void main(String[] args) {
        Status status1 = Status.ONLINE;
        Status status2 = Status.OFFLINE;
        Status status3 = Status.BLOCKED;

        System.out.println(status1.name() + " -> " + status1.description());
        System.out.println(status2.name() + " -> " + status2.description());
        System.out.println(status3.name() + " -> " + status3.description());
    }
}
