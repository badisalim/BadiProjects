package W6_2IceCreamabstract;

public abstract class IceCreamabstract {

    private String flavor;
    private String topping;

    public IceCreamabstract(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }

    public abstract String eat();

    public String getFlavor() {
        return flavor;
    }

    public String getTopping() {
        return topping;
    }
}


