package estudosJava.javacore.Npolimorfismo.test;

import estudosJava.javacore.Npolimorfismo.service.Animal;
import estudosJava.javacore.Npolimorfismo.domain.Cachorro;
import estudosJava.javacore.Npolimorfismo.domain.Gato;
import estudosJava.javacore.Npolimorfismo.domain.Passaro;

public class AnimaisTest {
    public static void main(String[] args) {

        Animal.fazerAnimalEmitirSom(new Cachorro(), 5);
        Animal.fazerAnimalEmitirSom(new Gato(), 8);
        Animal.fazerAnimalEmitirSom(new Passaro(), 12);

    }
}
