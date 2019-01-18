package W6_2IceCreamabstract;

public class ConeIceCream extends IceCreamabstract {

    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);


    }

    @Override
    public String eat() {
         return "The "+getFlavor()+" ice-cream with Oreo"+ getTopping()+" is licked";
    }
}
