package W3Julues;

import W4_7MapAdvancedIndexApplication.Topic;

import java.util.List;

public class CaesarApplication {

    public static void main(String[] args) {
        JuliusCaesar caesar = new JuliusCaesar();
        String ciphertext = caesar.encrypt("HELLO", 0);
        System.out.println(ciphertext);
    }

    public String encrypt(List<Topic> topicList) {
        return null;
    }
}
