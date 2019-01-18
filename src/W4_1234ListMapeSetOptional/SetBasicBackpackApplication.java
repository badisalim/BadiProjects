package W4_1234ListMapeSetOptional;

import java.util.HashSet;
import java.util.Set;

public class SetBasicBackpackApplication {
    public static void main(String[] args) {


        Set<String> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);
        String toothPast = "ToothPast";
        String phom = new String("Phom");
        String raiser = "Raiser";


        backpack.add(toothPast);
        backpack.add(phom);
        backpack.add(raiser);

        System.out.println("\n" + "Backpack: " + backpack);

        boolean containsToothPast = backpack.contains(toothPast);
        System.out.println("Is toothPast there? : " );
//        if (backpack.contains("hg")) {
//            System.out.println("Is raiser there? : " + true);
//        } else {
//            System.out.println("Is raiser there? : " + false);

            for (String string : backpack) {
            }
            //Print out the list
            backpack.remove(phom);

            System.out.println("\n" + "Backpack: " + backpack);

            boolean containsPhom = backpack.contains("phom");

            // System.out.println("Is phom there? : " + containsPhom);
            if (!containsPhom) {
                //System.out.println("Is phom there? : " + containsPhom);
                System.out.println("Backpack: " + backpack);
            }

            backpack.add(phom);
            backpack.add(phom);
            //s System.out.println("\n" + backpack);
            System.out.println("Backpack: " + backpack);

            int size = backpack.size();

            System.out.println(size);
        }
    }
