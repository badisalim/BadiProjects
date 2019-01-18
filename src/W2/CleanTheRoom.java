package W2;

import W2.MagnetCalculator.CalculatorMagnet;

import java.util.ArrayList;
import java.util.List;

public class CleanTheRoom {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Derek");
        names.add("Matilda");
        names.add("Hansel");

        List<String> rooms = new ArrayList<>();
        rooms.add("Living room");
        rooms.add("Studio");
        rooms.add("Bathroom");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Integer number1 = CalculatorMagnet.getNumber();
        Integer number2 = CalculatorMagnet.getNumber();
        Integer number3 = CalculatorMagnet.getNumber();

        Integer indicator = number1 * number2 * number3 * 199;

        while (names.size() > 0) {
            int candidate = indicator % names.size();
            String person = names.get(candidate);
            String room = rooms.get(0);
            Integer number = numbers.get(0);
            System.out.println("Person " + person + " gets the room " + room+"test number"+number);
            names.remove(candidate);
            rooms.remove(0);
            numbers.remove(number);
        }
    }

}
