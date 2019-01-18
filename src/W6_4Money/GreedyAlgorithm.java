package W6_4Money;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreedyAlgorithm {

    public List<Money> change(Integer cents) {
        List<Money> result = new ArrayList<>();

        Cent50 cent50 = new Cent50();
        Integer cents50 = cent50.money(cents);
        System.out.println(Cent50.getName()+cents50);

        result.add(cent50);
        cents = cents-(cents50 * 50);

        Cent20 cent20 = new Cent20();
        Integer cents20 = cent20.money(cents);
        System.out.println(Cent20.getName()+cents20);

        result.add(cent20);
        cents = cents-(cents20 * 20);

        Cent10 cent10 = new Cent10();
        Integer cents10 = cent10.money(cents);
        System.out.println(Cent10.getName()+cents10);

        result.add(cent10);
        cents = cents-(cents10 * 10);

        Cent5 cent5 = new Cent5();
        Integer cents5 = cent5.money(cents);
        System.out.println(Cent5.getName()+cents5);

        result.add(cent5);
        cents = cents-(cents5 * 5);

        Cent2 cent2 = new Cent2();
        Integer cents2 = cent2.money(cents);
        System.out.println(Cent2.getName()+cents2);

        result.add(cent2);
        cents = cents-(cents2 * 2);

        Cent1 cent1 = new Cent1();
        Integer cents1 = cent1.money(cents);
        System.out.println(Cent1.getName()+cents1);

        return result;

    }
}