package shop;

import java.util.Arrays;

public class Customer extends Person implements Discountable{
    private Size size;
    private Product[] products;



    public Customer(String name, Size size, Product[] products) {
        super(name);
        this.size = size;
        this.products = products;


    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "size=" + size +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice();
    }
}
