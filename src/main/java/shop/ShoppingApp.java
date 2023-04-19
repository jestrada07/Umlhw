package shop;

import java.text.DecimalFormat;

public class ShoppingApp {

    public static void printPersonName(Person person) {
        if (person instanceof Manager) {
            System.out.println(person.getName());
        } else if(person instanceof Student){
            System.out.println(person.getName());
        } else{
            System.out.println(person.getName());
        }


    }

    public static double calculateTotal(Product[] products) {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice();
        }

        return total;
    }


   public static boolean isAFit(Customer customer,Product product){
       if(customer.getSize() == product.getSize())

         return true;

       else{
           return false;
       }

    }


    public static void printEveryDiscountAvailableForAProduct(Discountable[] discountables, Product product) {
        for (Discountable d : discountables) {
            System.out.println(String.format("%.2f",d.calculateDiscount(product)));

            //String.format("%.2f" - means format the number as a floating
            // point with a precision of two decimal places.






        }



    }

}