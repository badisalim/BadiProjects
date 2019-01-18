package W3_3NumCorrector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCorrectorTest {

    @Test
    void testCorrect() {

        NumberCorrector numberCorrector = new NumberCorrector();

        Double correct = -5.4;
        Double correct1 =  5.4;

        numberCorrector.correct(correct);
        numberCorrector.correct(correct1);

       assertNotEquals(5, correct);
       assertNotEquals(5, correct1);


    }
}