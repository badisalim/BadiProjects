package W6_4Money;

import java.util.Scanner;

public class MoneyApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println(" input number");
        Integer money = scanner.nextInt();
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();

        System.out.println(greedyAlgorithm.change(money));
        System.out.println((money-((money/50)*50))/20);

        Cent1 cent1=new Cent1();

        System.out.println(cent1.money(money/50));


    }
}
