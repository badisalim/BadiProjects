package W2.interaction.house;

import W2.interaction.home.Tim;
import W2.interaction.home.upstairs.Grandma;

public class Jill {

    private void speak() {
        System.out.println("Jill speaks.");
    }

    private void speakWithTim(Tim tim) {
        tim.speak();
    }

    private void speakWithGrandma(Grandma grandma){
        // cannot speak with grandma
    }

}
