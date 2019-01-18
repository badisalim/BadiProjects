package W6_2IceCreamabstract;

public class IceCreamApplication {


    public static void main(String[] args) {

        IceCreamabstract cone = new ConeIceCream("chocolate","cream");
        IceCreamabstract cup = new CupIceCream("vanilla","cookies");
        System.out.println(cone.eat());
        System.out.println(cup.eat());
    }


}
