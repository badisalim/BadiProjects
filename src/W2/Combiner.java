package W2;
import java.util.ArrayList;
import java.util.List;

public class Combiner {

    public static void main(String[] args) {
        List<String> one = getCollection1();
        List<String> two = getCollection2();
        List<Integer> three = getCollection3();

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        List<String> combination = combine(one, two,three);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(combination);

    }

    private static List<String> getCollection1() {
        List<String> names = new ArrayList<>();
        names.add("dog" + " " + 10);
        names.add("cat");
        names.add("bird");
        return names;
    }

    private static List<String> getCollection2() {
        List<String> names = new ArrayList<>();
        names.add("table");
        names.add("chair");
        names.add("lamp");
        return names;
    }

    private static List<Integer> getCollection3() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        return numbers;
    }

    private static List<String> combine(List<String> one, List<String> two,List<Integer> three){
        List<String> combination = new ArrayList<>();

        while (areThereElementsIn(one, two,three)) {
                transfer(two, combination);
                transfer(one, combination);
                //transfer(three, combination);

            }
            return combination;

        }

        private static boolean areThereElementsIn (List < String > one, List < String > two,List<Integer>three){
            return !one.isEmpty() || !two.isEmpty();
        }

        private static void transfer (List < String > origin, List < String > destination){
            if (origin.isEmpty()) {
                return;
            }
            String firstElement = origin.get(0);
            origin.remove(0);
            //Integer first = origin.get(0);
            //origin.remove(0);
            destination.add(firstElement);
        }


    }
