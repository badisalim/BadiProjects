package W3_1Screen;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScreenTest {
    Screen screen = new Screen();


    @Test
    void testBusinessCustomer() {

        Customer customer = new Customer("Badi", "Business");
        String string = screen.display(customer);
        Assertions.assertEquals("BADI", string);

    }
    @Test
    void testEconomicCustomer() {

        Customer customer = new Customer("Badi", "Economic");
        String string = screen.display(customer);
        Assertions.assertEquals("badi", string);

    }
    @Test
    void testOtherCustomer() {

        Customer customer = new Customer("leen", "ghgh");
        String string = screen.display(customer);
        Assertions.assertEquals("leen", string);

    }

}





