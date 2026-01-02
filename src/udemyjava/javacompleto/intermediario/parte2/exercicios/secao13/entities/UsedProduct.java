package udemyjava.javacompleto.intermediario.parte2.exercicios.secao13.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    private LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName());
        stringBuilder.append(" (used) $ ");
        stringBuilder.append(getPrice());
        stringBuilder.append(" (Manufacture date: ");
        stringBuilder.append(manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

}
