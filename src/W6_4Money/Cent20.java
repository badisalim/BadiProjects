package W6_4Money;

public class Cent20 extends Money {
    public static String getName() {
        return ("No.of cent20: ");
    }

    @Override
    public Integer money(Integer coines) {
        return coines / 20;
    }

    @Override
    public String toString() {
        return "Cent20";
    }
}
