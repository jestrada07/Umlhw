package shop;

public class Main {


    public static void main(String[] args) {
        Product product1 = new Product("Shirt", 12.0, Size.LARGE);
        Product product2 = new Product("pants", 20.0,Size.SMALL );
        Product product3 = new Product("shoes", 90.0, Size.MEDIUM);
        Product[] arrayOfProducts = {product1,product2,product3};



        Business business1 = new Business("501 crest rd", product1);
        Student student1 = new Student("Bobby", 22334, Size.MEDIUM, arrayOfProducts);
        Manager manager1 = new Manager("Jake", Size.SMALL, arrayOfProducts);
        ShoppingApp.printPersonName(manager1);
        ShoppingApp.printPersonName(student1);
        System.out.println(business1);

        System.out.println(ShoppingApp.isAFit(student1, product3));

        ShoppingApp.calculateTotal(arrayOfProducts);







        Discountable[] discountable = {student1,business1, manager1};

        ShoppingApp.printEveryDiscountAvailableForAProduct(discountable, product3);









    }

}
