package W2.interaction.home.upstairs;


import W2.interaction.home.Tim;

public class Jill {

    void speak(){
        System.out.println("Jill speaks.");
    }

    private void speak(Tim tim){
        tim.speak();
    }

    private void speak(Grandma grandma){
        // does not have access to
        // grandma.speak();
    }


}
