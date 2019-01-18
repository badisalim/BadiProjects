package W6_4MoneyRabi;

import java.util.Arrays;
import java.util.List;

public class Moneys {

    public static List<Money> asList(){
        List<Money> list= Arrays.asList(new Cent50(),new Cent20(),new Cent10(),new Cent5(),new Cent2(),new Cent1());
        return list;
    }
}
