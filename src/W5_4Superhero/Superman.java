package W5_4Superhero;

import W5_5AdvancedSuperhero.Villain;

public class Superman implements Superhero {
    @Override
    public String getName() {
        return "superman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }
}
