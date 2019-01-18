package W5_6Wardrobe;

public class AddDoor implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("door");
    }
}
