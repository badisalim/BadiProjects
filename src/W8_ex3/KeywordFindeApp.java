package W8_ex3;

import java.util.List;

public class KeywordFindeApp {

    public static void main(String[] args) {

         KeywordFinder finder = new KeywordFinder();
         FileReader reader = new FileReader();

        List<String> sentence3 = reader.asLines("W5_text/Exercises");
         String sentence = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
         String sentence1 = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";

        System.out.println(sentence);
        System.out.println(sentence1);



        System.out.println(finder.findElegant(sentence));
        System.out.println(finder.findPlayful(sentence1));

        System.out.println(sentence3);
        for (String word :
                sentence3) {
            //System.out.println(finder.findPlayful(word ));
            System.out.println(finder.findElegant(word));
        }


    }
}
