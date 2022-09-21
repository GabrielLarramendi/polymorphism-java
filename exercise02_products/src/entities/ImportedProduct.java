package entities;

public class ImportedProduct extends Product{

    private double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return price + customsFee;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" $ ");
        sb.append(String.format("%.2f", totalPrice()));
        sb.append(" (Customs fee: $ ");
        sb.append(String.format("%.2f", customsFee));
        sb.append(")");
        return  sb.toString();
    }
}
