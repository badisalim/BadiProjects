package A;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {


    Batman batman = new Batman();
    Superman superman = new Superman();
    Spiderman spiderman = new Spiderman();
    List<Superhero> superheroes = Arrays.asList(batman, superman, spiderman);

    public Superhero call() {

Random random=new Random();

        Integer randomHero=random.nextInt(superheroes.size());

       return superheroes.get(randomHero);
    }

}






