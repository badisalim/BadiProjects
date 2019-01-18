package W8_lecture.group;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GroupAssignerTest {

    private GroupAssigner assigner = new GroupAssigner();

    @Test
    void assign() {
        String samantha = "Samantha";

        String group = assigner.assign(samantha, name -> name.length());
        Assertions.assertEquals("Group 0", group);

        group = assigner.assign(samantha, name -> name.length() + 3);
        Assertions.assertEquals("Group 1", group);
    }
}