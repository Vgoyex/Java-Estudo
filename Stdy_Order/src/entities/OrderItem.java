package entities;


public class OrderItem {

    private Integer quantity;
    private Double price;
    //!  !!!!!!!!!!!!!!!!!!! IMPORTANTE !!!!!!!!!!!!!!!!!!!!!!
    private Product product;
    //!  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


    @Override
    public String toString() {
        return  product.getName() + ", $" + price + ", Quantity: " + quantity + ", Subtotal: $" + subTotal();
    }

    public OrderItem(){}

    public OrderItem(Integer quantity, Double price,Product product){this.quantity = quantity;this.price = price;this.product = product;}

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal(){
        return this.quantity * this.price;
    }
}
