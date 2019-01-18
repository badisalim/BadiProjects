package W6_4Money;

public class Cent2 extends Money {

    public static String getName() {
        return ("No.of cent2: ");
    }

    @Override
    public String toString() {
        return "Cent2";
    }

    @Override
    public Integer money(Integer coines) {
        return coines / 2;
    }
}
