package estudosJava.javacore.Kenums.test;

import estudosJava.javacore.Kenums.domain.Meses;

public enum DiasDaSemana {
        DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;

        public static void main(String[] args) {
            DiasDaSemana dia = DiasDaSemana.TERCA;
            System.out.println("dia escolhido: "+dia);
            Meses mes = Meses.AGOSTO;
            mes.imprimir();
        }

}

