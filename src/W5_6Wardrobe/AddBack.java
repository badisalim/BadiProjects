package W5_6Wardrobe;

public class AddBack implements Step {


    @Override
    public void perform(Furniture furniture) {
        furniture.add("back");
    }
}