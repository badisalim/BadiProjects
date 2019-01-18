package W5_5AdvancedSuperhero;

import W5_4Superhero.Superhero;
import W5_4Superhero.SuperheroCaller;

public class AdvancedSuperheroApplication {

    public static void main(String[] args) {

        SuperheroCaller superheroCaller = new SuperheroCaller();
        Joker joker = new Joker();

        for (int times = 0; times < 10; times++) {
            Superhero badi = superheroCaller.call();
            badi.fight(joker);

        }

    }
}
