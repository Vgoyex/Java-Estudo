package entities;

public class ImportedProduct extends Product{
    private Double customsFee;
    public ImportedProduct(){}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" $ ").append(price).append(" ").append("(Customs fee: $").append(customsFee).append(")").append("\n");
        return sb.toString();
    }

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return "priceTag ImportedProduct";
    }

    public Double totalPrice(){
        return 0.00;
    }
}
