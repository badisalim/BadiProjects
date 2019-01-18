package W2.interaction.home.upstairs;

import W2.interaction.home.Tim;

public class Grandma {

    private void speak() {
        System.out.println("Grandma speaks.");
    }

    private void speak(Jill jill) {
        jill.speak();
    }

    private void speak(Tim tim) {
        tim.speak();
    }

}
