import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("T-Shirt", 5000));
        products.add(new Product("Jeans", 4500));
        products.add(new Product("Jacket", 80000));
        products.add(new Product("Sneakers", 55000));


        ClothingStore store = new ClothingStore(products);
        Iterator<Product> iterator = store.createIterator();

        System.out.println("Products in the store:");
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product.getName()+ ": " + product.getPrice() + " KZT");
        }
    }
}