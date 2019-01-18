package W5_6Wardrobe;

public class AddShelf implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("shelf");
    }
}
