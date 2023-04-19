package shop;

public class Student extends Customer {
    private final long studentID;
    private static long uniqueID;
    private final double STUDENT_DISCOUNT = 0.05;




    public Student(String name, Size size, Product[] products) {
        super(name, size, products);
        studentID = ++uniqueID;


    }

    public long getStudentID() {
        return studentID;
    }

    @Override
    public double calculateDiscount(Product product) {
        return STUDENT_DISCOUNT * product.getPrice();

    }
}

