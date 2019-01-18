package A;

public class AdvancedSuperheroApplication {

    public static void main(String[] args) {

        SuperheroCaller superheroCaller = new SuperheroCaller();

        Joker joker = new Joker();

        for (int times = 0; times < 10; times++) {

            Superhero callHero = superheroCaller.call();
            callHero.fight(joker);

        }
    }
}
