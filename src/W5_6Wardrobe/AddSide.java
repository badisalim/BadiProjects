package W5_6Wardrobe;

public class AddSide implements Step {


    @Override
    public void perform(Furniture furniture) {
        furniture.add("side");
    }
}
