import java.util.*;

class ClothingStore implements Aggregate<Product> {
    private List<Product> products;

    public ClothingStore(List<Product> products) {
        this.products = products;
    }

    @Override
    public Iterator<Product> createIterator() {
        return new ProductIterator(products);
    }
}