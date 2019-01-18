package W6_4Money;

public class Cent50 extends Money {
    public static String getName() {
        return ("No.of cent50: ");
    }



    @Override
    public Integer money(Integer money) {
        return money/50;
    }

    @Override
    public String toString() {
        return "Cent50";
    }
}
