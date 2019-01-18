package W3.tests;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManipulatorTest {

    private Manipulator manipulator = new Manipulator();

    @Test
    void reverse() {
        String reversed = manipulator.reverse("Hello there!");
        assertEquals("!ereht olleH", reversed, "Strings are not the same");
    }

    @Test
    void testLetterTransformations() {
        String originalAsmall = "a";
        int codeAsmall = manipulator.toAscii(originalAsmall);
        assertEquals(97, codeAsmall);

        String letterAsmall = manipulator.toLetter(codeAsmall);
        assertEquals(originalAsmall, letterAsmall);

        String originalAbig = "A";
        int codeAbig = manipulator.toAscii(originalAbig);
        assertEquals(65, codeAbig);

        String letterAbig = manipulator.toLetter(codeAbig);
        assertEquals(originalAbig, letterAbig);
    }
}