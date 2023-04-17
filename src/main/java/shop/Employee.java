package shop;

public class Employee extends Customer {
    protected final double EMPLOYEE_DISCOUNT = .10;


    public Employee(String name, Size size, Product[]products) {
        super(name,size,products);




    }

    @Override
    public double calculateDiscount(Product product) {
        return EMPLOYEE_DISCOUNT * product.getPrice();
    }
}
