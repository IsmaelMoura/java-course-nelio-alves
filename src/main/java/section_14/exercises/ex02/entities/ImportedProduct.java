package section_14.exercises.ex02.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return new StringBuilder()
                .append(getName())
                .append(" $ ")
                .append(String.format("%.2f", totalPrice()))
                .append(" (Customs fee: $ ")
                .append(String.format("%.2f", customsFee))
                .append(")")
                .toString();
    }
}
