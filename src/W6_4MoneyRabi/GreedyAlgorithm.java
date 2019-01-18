package W6_4MoneyRabi;

import java.util.ArrayList;
import java.util.List;

public class GreedyAlgorithm {

    public List<Money> change(Integer cents) {
      //  Scanner cents1=new Scanner(System.in);

        List<Money> list = Moneys.asList();
        List<Money> result = new ArrayList<>();
        while (cents > 0) {
            for (Money money : list) {
                if (cents >= money.getValue()) {
                    cents = cents - money.getValue();
                    result.add(money);
                    break;
                }



            }
        }
        System.out.println(result);
        return result;
    }
}
