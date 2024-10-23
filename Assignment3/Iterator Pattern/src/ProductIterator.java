import java.util.*;
class ProductIterator implements Iterator<Product> {
    private int currentIndex = 0;
    private final List<Product> products;

    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < products.size();
    }

    @Override
    public Product next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return products.get(currentIndex++);
    }
}