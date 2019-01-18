package A;

public class Spiderman implements Superhero {
    @Override
    public String getName() {
        return "spiderman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }
}
