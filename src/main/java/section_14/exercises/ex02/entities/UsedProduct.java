package section_14.exercises.ex02.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

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
    public String priceTag() {
        return new StringBuilder()
                .append(getName())
                .append(" (used) $ ")
                .append(String.format("%.2f", getPrice()))
                .append(" (Manufacture date: ")
                .append(sdf.format(manufactureDate))
                .append(")")
                .toString();
    }
}
