package W3_1Screen;

public class Screen {

    public String display(Customer customer) {

        if (customer.getCategory() == "Economic") {

            String Type = customer.getName().toLowerCase();
            System.out.println(Type);
            return Type;


            // System.out.println(customer.getName().toLowerCase());


        }
        if (customer.getCategory() == "Business") {

            String Type = customer.getName().toUpperCase();
            System.out.println(Type);
            return Type;
        }

            System.out.println("wrong Input");

            return customer.getName();



    }
}

//    public void display(Customer customer) {
//        System.out.println("Name " + modifyName(customer));
//        System.out.println("Category " + customer.getCategory());
//
//    }
//
//
//   private String modifyName(Customer customer) {
//
//
//        String modifiedName = customer.getName();
//        String category=customer.getCategory();
//
//
//        if (category == "Business class") {
//            modifiedName=modifiedName.toUpperCase();
//
//        }
//        if (category == "Economic class") {
//            modifiedName=modifiedName.toLowerCase();
//
//        }
//       if (category == "") {
//           modifiedName=modifiedName.toLowerCase();
//           return "sorry wrong input";}
//
//       return modifiedName;
//    }
//
//
//
//}
//
