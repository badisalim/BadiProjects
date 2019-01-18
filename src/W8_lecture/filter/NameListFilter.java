package W8_lecture.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NameListFilter {

    public List<String> filter(List<String> names, Predicate<String> condition) {
        List<String> filtered = new ArrayList<>();
        for (String name : names) {
            if (condition.test(name)) {
                filtered.add(name);
            }
        }
        return filtered;
    }

}
