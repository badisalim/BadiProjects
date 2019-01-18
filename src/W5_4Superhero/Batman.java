package W5_4Superhero;

import W5_5AdvancedSuperhero.Villain;

public class Batman implements Superhero {
    @Override
    public String getName() {
        return "batman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }
}
