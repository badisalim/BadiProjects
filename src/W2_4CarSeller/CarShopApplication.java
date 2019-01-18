package W2_4CarSeller;

public class CarShopApplication {


    public static void main(String[] args) {

        Car bmw = new Car("BMW");
        Car audi = new Car("AUDI");
        Car lexes = new Car("LEXES");
        Seller seller=new Seller();
        seller.recievCar(bmw);
        seller.recievCar(audi);
        seller.recievCar(lexes);
    }
}
