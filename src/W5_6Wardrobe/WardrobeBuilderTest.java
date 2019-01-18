package W5_6Wardrobe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WardrobeBuilderTest{

    @Test
    void WardrobeBuilderTest() {
        WardrobeBuilder wardrobeBuilder=new WardrobeBuilder();

        Wardrobe wardrobe=wardrobeBuilder.build();

        List<String>expected= Arrays.asList("bottom","side","side","back","top","shelf","shelf","shelf","shelf","shelf","shelf","shelf","shelf","door","door");

        Assertions.assertEquals(expected,wardrobe.getParts());
    }


}