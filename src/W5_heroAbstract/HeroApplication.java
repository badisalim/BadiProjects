package W5_heroAbstract;

import W5_hero.Batman;
import W5_hero.Hero;
import W5_hero.Superman;

import java.util.Arrays;
import java.util.List;

public class HeroApplication {

    public static void main(String[] args) {
        List<Hero> heroes = getHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero name: " + hero.getName());
            System.out.println("Saves the city by: ");
            hero.saveTheCity();
        }

    }

    private static List<Hero> getHeroes() {
        return Arrays.asList(new Batman(), new Superman());
    }

}
