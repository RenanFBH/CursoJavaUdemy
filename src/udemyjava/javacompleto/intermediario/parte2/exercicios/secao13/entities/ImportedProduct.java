package udemyjava.javacompleto.intermediario.parte2.exercicios.secao13.entities;

public class ImportedProduct extends Product {

    private double customFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName());
        stringBuilder.append(" $ ");
        stringBuilder.append(getPrice());
        stringBuilder.append(" (Customs fee: $ ");
        stringBuilder.append(this.customFee);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public double totalPrice() {
        return getPrice() + customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

}
