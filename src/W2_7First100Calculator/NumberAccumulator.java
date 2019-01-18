package W2_7First100Calculator;

import java.util.List;

public class NumberAccumulator {

    Integer accumulate(List<Integer> numbers) {
        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

}