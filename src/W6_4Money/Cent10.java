package W6_4Money;

public class Cent10 extends Money {
    public static String getName() {
        return ("No.of cent10: ");
    }

    @Override
    public String toString() {
        return "Cent10";
    }

    @Override
    public Integer money(Integer coines) {
        return coines / 10;
    }
}
