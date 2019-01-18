package W3_2InsuranceTemplate;

import W3_1Screen.Customer;

public class TemplateChooser {


    public String chooseTemplate(Customer customer) {
        String name = customer.getName();
        String template = "";

        if (name.startsWith("Mr.")) {
            System.out.println("send man Template");
            template = "man";

        } else if (name.startsWith("Ms.") || name.startsWith("Mrs.")) {
            System.out.println("send women Template");
            template = "woman";
        }
        else if (name.contains("Hokopoko")) {
            System.out.println("send privileged Template");
            template = "privileged";

        } else {

            System.out.println("send default Template");
            template = "default";

        }

        return template;
    }

}


//    Exercise 2
//    An insurance company wants to send customized emails to their customers.
//    If the name starts with Mr. they want to send the man template. If it starts with Ms. or Mrs.
//    they want to send the woman template. Also, the Hokopoko family is the owner of the company,
//    and if the email would be sent to anyone of that family, they want to send the privileged template.
//    If neither of the previous cases are recognized through the name, then they want to use the default template.
//    Develop the code that the insurance company uses in their email application to choose the right template.
//    Follow the instructions below:
//  You need the following classes: Customer, TemplateChooser and InsuranceApplication.
//  Reuse the Customer from exercise 1.
//  The TemplateChooser has no attributes. It has the chooseTemplate method that receives a customer
//    and returns the word man, woman, privileged or default depending on the insurance company’s requirements.
//  In the InsuranceApplication class main method, create several Customers and a TemplateChooser and see the results.
//  [Testing] Create the TemplateChooserTest class and test its behavior. Write four methods:
//    testManTemplate, testWomanTemplate, testPrivilegedTemplate and testDefaultTemplate.
//    What happens in each one of the cases? What happens when there is a space at the beginning of their name?
//    Hints:
//    The startsWith, contains and trim methods from the String class might be useful.

//The startsWith, contains and trim methods from the String class might be useful.