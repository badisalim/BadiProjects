package W3_2InsuranceTemplate;

import W3_1Screen.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {
        TemplateChooser templateChooser = new TemplateChooser();
        Customer customer1=new Customer("Mr.", "business");
        Customer customer2=new Customer("Ms.","economic");
        Customer customer3=new Customer("Mrs.","business");
        Customer customer4=new Customer("Hokopoko","");
        Customer customer5=new Customer("","");
        //Customer customer3=new Customer("Hokopoko ","you have no category");

        templateChooser.chooseTemplate(customer1);
        templateChooser.chooseTemplate(customer2);
        templateChooser.chooseTemplate(customer3);
        templateChooser.chooseTemplate(customer4);
        templateChooser.chooseTemplate(customer5);

    }
}
