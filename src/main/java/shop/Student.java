package shop;

public class Student extends Customer {
    private long studentID;
    private final double STUDENT_DISCOUNT = 0.05;




    public Student(String name, long studentID, Size size, Product[] products) {
        super(name, size, products);
        this.studentID = studentID;


    }

    @Override
    public double calculateDiscount(Product product) {
        return STUDENT_DISCOUNT * product.getPrice();

    }
}

