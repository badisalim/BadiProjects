package W3_2InsuranceTemplate;

import W3_1Screen.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateChooserTest {

    @Test
    void testManTemplate() {


        Customer customer1=new Customer("Mr.","");

        TemplateChooser templateChooser=new TemplateChooser();

        String string=templateChooser.chooseTemplate(customer1);

        assertEquals("man",string);


    }

    @Test
    void testWomanTemplate() {


        Customer customer1=new Customer("Mrs.","");

        TemplateChooser templateChooser=new TemplateChooser();

        String string=templateChooser.chooseTemplate(customer1);

        assertEquals("woman",string);


    }
    @Test
    void testPrivilegedTemplate() {


        Customer customer1=new Customer("Hokopoko","");

        TemplateChooser templateChooser=new TemplateChooser();

        String string=templateChooser.chooseTemplate(customer1);

        assertEquals("privileged",string);


    }
    @Test
    void testDefaultTemplate() {


        Customer customer1=new Customer("","");

        TemplateChooser templateChooser=new TemplateChooser();

        String string=templateChooser.chooseTemplate(customer1);

        assertEquals("default",string);


    }

}