package section_20.main.util;

import section_20.main.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
