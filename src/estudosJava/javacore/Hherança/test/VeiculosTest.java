package estudosJava.javacore.Hherança.test;

import estudosJava.javacore.Hherança.domain.CarroHeranca;
import estudosJava.javacore.Hherança.domain.MotoHerenca;
import estudosJava.javacore.Hherança.domain.Veiculo;

public class VeiculosTest {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[4];
        veiculos[0] = new CarroHeranca("Chevrolet", "Onix", 100);
        veiculos[1] = new CarroHeranca("Toyota", "Hilux", 120);
        veiculos[2] = new MotoHerenca("BMW", "1200-gs", 130);
        veiculos[3] = new MotoHerenca("Honda", "CG 160", 125);

        for (Veiculo veiculo : veiculos) {
            veiculo.dados();
            veiculo.acelerar();
            veiculo.freiar();
        }
    }
    
}
