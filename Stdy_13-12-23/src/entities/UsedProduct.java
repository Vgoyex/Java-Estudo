package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    private Date manufactureDate;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" (used) $ ").append(price).append(" ").append("(Manufacture date: ").append(format.format(manufactureDate)).append(")");
        return sb.toString();
    }

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag(){
        return "priceTag UsedProduct";
    }

}
