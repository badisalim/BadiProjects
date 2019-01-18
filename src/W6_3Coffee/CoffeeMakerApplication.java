package W6_3Coffee;

import java.util.List;

public class CoffeeMakerApplication {

    public static void main(String[] args) {
        List<CoffeeMaker> coffeeMakers = CoffeeMakers.asList();

        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            Coffee coffee = coffeeMaker.brew();
            String name = coffee.getMadeBy();
            Integer time = coffee.getBrewedTime();
            System.out.println(name + "  brewed a coffee and it took "+ time);
        }
    }
}
