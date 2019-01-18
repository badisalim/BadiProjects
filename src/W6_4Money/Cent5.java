package W6_4Money;

public class Cent5 extends Money {

    public static String getName() {
        return ("No.of cent5: ");
    }

    @Override
    public String toString() {
        return "Cent5";
    }

    @Override
    public Integer money(Integer coines) {
        return coines / 5;
    }
}
