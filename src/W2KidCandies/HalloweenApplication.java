package W2KidCandies;

import java.util.List;

public class HalloweenApplication {
    public static void main(String[] args) {
        // gather kids (names, candy)
        // figure out the winner kid (the most candy)

        // Kid - domain - data
        // Journalist - agent - get list of kids
        // Halloween Judge - say who is the winner

        Journalist journalist = new Journalist();


        //List<Kid> kids = journalist.getNeighborhoodKids();
        List<Kid> kids = new Journalist().getNeighborhoodKids();
        for (Kid kid :
                journalist.getNeighborhoodKids()) {
            System.out.println(kid.getName() + kid.getNamesOfCandies());
            System.out.println(kid.getName() + kid.getNumbersOfCandies());

        }
        HalloweenJudge judge = new HalloweenJudge();
        judge.displayWhoIsTheWinner(kids);

//        public static void main (String[]args){
//            Kid letter = new Kid("Fake address 123");
//            Journalist assistant = new Journalist();
//            assistant.stamp(letter);
//            assistant.send(letter);
//
//
//        }
    }
}