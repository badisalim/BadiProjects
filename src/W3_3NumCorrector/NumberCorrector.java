package W3_3NumCorrector;

public class NumberCorrector {

    public Integer correct(Double number) {

        number = Math.abs(number);
        number = Math.floor(number);

        int correct = number.intValue();

        System.out.println(correct);

        return correct;



    }

}



