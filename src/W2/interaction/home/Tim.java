package W2.interaction.home;

import W2.interaction.home.upstairs.Grandma;
import W2.interaction.home.upstairs.Jill;



public class Tim {

    public void speak() {
        System.out.println("Tim speaks.");
    }

    private void speak(Grandma grandma){
        // does not have access to
        // grandma.speak();
    }

    private void speak(Jill jill) {
        // does not have access to
        // jill.speak();
    }

}
