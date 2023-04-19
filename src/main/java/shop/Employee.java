package shop;

public abstract class Employee extends Customer {
    protected final double EMPLOYEE_DISCOUNT = .10;


    public Employee(String name, Size size, Product[]products) {
        super(name,size,products);




    }
    //Abstract method
    abstract void printEmployeePriceAfterDiscount(Product product);//camelCase






    @Override
    public double calculateDiscount(Product product) {
        return EMPLOYEE_DISCOUNT * product.getPrice();
    }
}
