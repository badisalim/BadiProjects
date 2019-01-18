package W6_CarEvaluation;

public class AutomaticCar extends Car {

    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "Automatic";
    }


}
