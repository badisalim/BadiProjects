package W8_lecture.filter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class NameListFilterTest {

    private NameListFilter filter = new NameListFilter();

    private List<String> names = Arrays.asList(
            "Adib", "Sahar", "Hosam", "Rabi",
            "Mohammed", "Hamada", "Tamara");

    @Test
    void filterShortNames() {

        Predicate<String> condition = name -> name.length() < 5;

        List<String> filtered = filter.filter(names, condition);
        List<String> expected = Arrays.asList("Adib", "Rabi");
        Assertions.assertEquals(expected, filtered);

        condition = name -> name.length() < 6;

        filtered = filter.filter(names, condition);
        expected = Arrays.asList("Adib", "Sahar", "Hosam", "Rabi");
        Assertions.assertEquals(expected, filtered);

        condition = name -> name.contains("b");

        filtered = filter.filter(names, condition);
        expected = Arrays.asList("Adib", "Rabi");
        Assertions.assertEquals(expected, filtered);

        condition = name -> name.contains("b") && name.endsWith("i");

        filtered = filter.filter(names, condition);
        expected = Arrays.asList("Rabi");
        Assertions.assertEquals(expected, filtered);
    }
}