package W5_6Wardrobe;

public class AddBottom implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("bottom");
    }
}
