package W8_lecture.group;

import java.util.function.Function;

public class GroupAssigner {

    public String assign(String name, Function<String, Integer> function) {
        int number = function.apply(name);
        int numberOfGroups = 2;
        int group = number % numberOfGroups;
        return "Group " + group;
    }

}
