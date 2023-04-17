package shop;

public class Product {
   private String description;
   private double price;
   private Size size;

   public Product(String description, double price, Size size){
       this.description = description;
       this.price = price;
       this.size = size;


   }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + this.description + '\'' +
                ", price=" + this.price +
                ", size=" + this.size +
                '}';
    }
}
