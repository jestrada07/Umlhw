package shop;

public class Business implements Discountable {
   private String address;
  private Product product;
  private final double BUSINESS_DISCOUNT = 0.25;

  public Business(String address, Product product){
    this.address = address;
    this.product = product;


  }







  @Override
  public double calculateDiscount(Product product) {
    return BUSINESS_DISCOUNT * product.getPrice();
  }


  @Override
  public String toString() {
    return "Business{" +
            "address='" + address + '\'' + "product='" + product + '\''
            + '}';
  }
}
