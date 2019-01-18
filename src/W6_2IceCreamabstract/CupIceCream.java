package W6_2IceCreamabstract;

public class CupIceCream extends IceCreamabstract {
    public CupIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "The "+getFlavor()+ " ice-cream with " +getTopping()+" is eaten with a spoon";
    }
}
