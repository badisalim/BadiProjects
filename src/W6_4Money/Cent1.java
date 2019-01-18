package W6_4Money;

public class Cent1 extends Money {

    public static String getName() {
        return ("No.of cent1: ");
    }

    @Override
    public String toString() {
        return "Cent1";
    }

    @Override
    public Integer money(Integer coines) {
        return coines/1;
    }

}
