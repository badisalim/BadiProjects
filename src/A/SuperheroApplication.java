package A;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SuperheroApplication {


    public static void main(String[] args) {
Superhero superhero=new Superman();

        System.out.println(superhero.getName());
List<Superhero>superheroes=new ArrayList<>();
SuperheroCaller superheroCaller=new SuperheroCaller();
        for (int i = 0; i <6 ; i++) {

            int times=i+1;
          superheroes.add(superhero);
            System.out.println("Superhero: "+times+superheroCaller.call().getName());

        }

        System.out.println(superheroes.size());
    }


}