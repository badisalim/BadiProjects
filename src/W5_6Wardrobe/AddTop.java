package W5_6Wardrobe;

public class AddTop implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("top");
    }
}
