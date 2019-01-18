package W9_ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
    private Caesar caesar = new Caesar();

    @Test
    void cipher() {
        String encrypted = caesar.cipher("HELLO", 1);
        Assertions.assertEquals("IFMMP",encrypted);
        System.out.println(encrypted);
    }
}