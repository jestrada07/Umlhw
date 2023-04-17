package shop;

public class Manager extends Employee {
    private final double MANAGER_DISCOUNT = 0.05;

    public Manager(String name, Size size, Product[] product) {
        super(name,size,product);
    }






    @Override
    public double calculateDiscount(Product product) {
        return (super.EMPLOYEE_DISCOUNT + MANAGER_DISCOUNT) * product.getPrice();


    }


}
