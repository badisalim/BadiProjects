package W5_makeup;

public class Girl {

    private Lipstick redLipstick;

    public Girl(Lipstick lipstick) {
        this.redLipstick = lipstick;
    }

    public void wearMakeup() {
        System.out.println("I will wear lipstick color " + redLipstick.getColor());
    }
}
