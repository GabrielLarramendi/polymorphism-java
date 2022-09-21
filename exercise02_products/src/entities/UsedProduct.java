package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate manufacturedDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, LocalDate manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" (Used)");
        sb.append(" $ ");
        sb.append(String.format("%.2f", price));
        sb.append(" (Manufacture date: ").append(manufacturedDate.format(dateFormatted)).append(")");
        return  sb.toString();
    }
}
