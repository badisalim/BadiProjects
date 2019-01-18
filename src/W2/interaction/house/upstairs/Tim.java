package W2.interaction.house.upstairs;


import W2.interaction.home.upstairs.Jill;

public class Tim {

    public void speak() {
        System.out.println("Tim speaks.");
    }

    public void speakWithJill(Jill jill) {
        // Tim cannot speak with Jill
    }

    private void speakWithGrandma(Grandma grandma) {
        grandma.speak();
    }

}
