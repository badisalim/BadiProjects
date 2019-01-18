package W2KidCandies;

import java.util.ArrayList;
import java.util.List;

public class Journalist {

    public List<Kid> getNeighborhoodKids() {
        List<Kid> kids = new ArrayList<>();
//        public List<Integer> getNumbersOfCandies() {
//            List<Integer> integers = new ArrayList<>();

        List<String> namesOfCandiesTom = new ArrayList<>();
        List<String> namesOfCandiesSam = new ArrayList<>();
        List<Integer> numbersOfCandiesTom = new ArrayList<>();
        List<Integer> numbersOfCandiesSam = new ArrayList<>();

        Kid tom = (new Kid("Tom", 15, namesOfCandiesSam, numbersOfCandiesSam));
        kids.add(tom);
        namesOfCandiesTom.add(("ships"));
        numbersOfCandiesTom.add(16);

        Kid jimmy = (new Kid("Jimmy", 10, namesOfCandiesTom, numbersOfCandiesTom));

        kids.add(jimmy);
        namesOfCandiesTom.add("chocolate");
        namesOfCandiesTom.add("chocoprince");
        namesOfCandiesSam.add("lollipop");
        namesOfCandiesSam.add("cake");

        numbersOfCandiesTom.add(20);
        numbersOfCandiesTom.add(30);
        numbersOfCandiesSam.add(40);
        numbersOfCandiesSam.add(50);

        kids.add(new Kid("Tom", 4, namesOfCandiesTom, numbersOfCandiesTom));
        kids.add(new Kid("Sam", 16, namesOfCandiesSam, numbersOfCandiesSam));
        kids.add(new Kid("Pamela", 11, namesOfCandiesTom, numbersOfCandiesTom));
        return kids;
    }

    public void stamp(Kid letter) {
        letter.stamp();
    }

    public void send(Kid letter) {
        if (letter.isStamped()) {
            System.out.println("I will send it to: " + letter.getName());
        } else {
            System.out.println("You have to stamp it first.");
        }
    }

}
