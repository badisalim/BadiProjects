package W9_ex3;

import W3Julues.JuliusCaesar;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {
    private JuliusCaesar caesar = new JuliusCaesar();

    public String cipher(String plainText, Integer key) {
        return Stream.of(plainText)
                .map(s -> caesar.encrypt(s, key))
                .collect(Collectors.joining());

    }
}
