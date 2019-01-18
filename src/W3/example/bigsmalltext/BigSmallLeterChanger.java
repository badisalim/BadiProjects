package W3.example.bigsmalltext;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BigSmallLeterChanger {

    private Boolean isBig = true;

    private Random random = new Random();

    public String change(String text) {
        List<String> letters = splitIntoLetters(text);
        String result = "";
        for (String letter : letters) {
            String transformedLetter = transform(letter);
            result += transformedLetter;
        }
        return result;
    }


    private List<String> splitIntoLetters(String text) {
        String[] split = text.split("");
        return Arrays.asList(split);
    }

    private String transform(String letter) {
        char character = letter.charAt(0);
        if (!Character.isAlphabetic(character)) {
            return letter;
        }

        String transformed;
        if (isBig) {
            transformed = letter.toUpperCase();
        } else {
            transformed = letter.toLowerCase();
        }

        isBig = !isBig;

        return transformed;
    }

    public String changeRandomly(String text) {
        List<String> letters = splitIntoLetters(text);
        String result = "";
        for (String letter : letters) {
            result += transformRandomly(letter);
        }
        return result;
    }

    private String transformRandomly(String letter) {
        boolean isBig = random.nextBoolean();
        if (isBig) {
            return letter.toUpperCase();
        }
        return letter.toLowerCase();
    }
}
