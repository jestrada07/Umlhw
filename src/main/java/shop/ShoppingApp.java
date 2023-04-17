package shop;

public class ShoppingApp {

    public static void printPersonName(Person person) {

        System.out.println(person.getName());

    }

    public static double calculateTotal(Product[] products) {
        double total = 0;
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


    public static void printEveryDiscountAvailableForAProduct(Discountable[] discount, Product product) {
        for (Discountable d : discount) {

            double calculatedDiscount = d.calculateDiscount(product);
            System.out.println(calculatedDiscount);

        }



    }

}