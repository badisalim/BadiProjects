package W3Julues;
//
//import sun.swing.BakedArrayList;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class JuluesCaiser {
//
//    private List<String> alphabet;
//    private List<String> shift;
//
//    public JuluesCaiser() {
//        String alphabetEncr="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String[] array=alphabetEncr.split("");
//        alphabet= Arrays.asList(array);
//        shift = new ArrayList<>(alphabet);
//    }
//
//    public static void main(String[] args) {
//
//        String[] array=alphabetDecr.split("");
//        List<String> alphabets1= Arrays.asList(array1);
//        for (String alphabet : alphabets) {
//           Boolean match= alphabet.matches();
//           alphabet=alphabetDecr.get(le)
//        }
//        int position = alphabets.indexOf(alphabetDecr);
//
//    }
//
//    public String encrypt(String plaintext, int key) {
//        List<String> encryptedLetters = new ArrayList<>();
//        Collections.rotate(shift, -key);
//        String[] split = plaintext.split("");
//        List<String> letters = Arrays.asList(split);
//        for (String letter : letters) {
//            letter = letter.toLowerCase();
//            if(!alphabet.contains(letter)){
//                encryptedLetters.add(letter);
//            } else {
//                int position = alphabet.indexOf(letter);
//                String encrypted = shift.get(position);
//                encryptedLetters.add(encrypted);
//            }
//        }
//        return String.join("", encryptedLetters);
//    }
//}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JuliusCaesar {
    private List<String> alphabet;
    private List<String> shift;

    public JuliusCaesar() {
        String alphabetEncr = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String[] array = alphabetEncr.split("");
        alphabet = Arrays.asList(array);

        shift = new ArrayList<>(alphabet);
    }


    public String encrypt(String plaintext, int key) {
        List<String> encrypted = new ArrayList<>();
        Collections.rotate(shift, -key);
        String[] array = plaintext.split("");
        List<String> letters = Arrays.asList(array);

        for (String letter : letters) {

            String bigLetter = letter.toUpperCase();
            if (!alphabet.contains(bigLetter)) {
                encrypted.add(letter);
            } else {

                int position = alphabet.indexOf(bigLetter);
                String encryptedLetter = shift.get(position);
                if(Character.isLowerCase(letter.charAt(0))){
                    encryptedLetter = encryptedLetter.toLowerCase();
                }
                encrypted.add(encryptedLetter);
             /*  if (encryptedLetter.equalsIgnoreCase(letter)) {
                   encrypted.add(encryptedLetter);
               } else {
                   encryptedLetter.toLowerCase();
                   encrypted.add(encryptedLetter);
               }*/

            }
        }

        return String.join("", encrypted);
    }
}