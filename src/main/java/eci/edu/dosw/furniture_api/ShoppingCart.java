package eci.edu.dosw.furniture_api;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addItem(Product product) {
        if (product != null) {
            Product existingProduct = findProductById(product.getId());
            if (existingProduct != null) {
                existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
            } else {
                products.add(product);
            }
        }
    }

    public void removeItem(String productId) {
        products.removeIf(product -> product.getId().equals(productId));
    }


    private Product findProductById(String productId) {
        return products.stream()
                .filter(product -> product.getId().equals(productId)).findFirst().orElse(null);
    }

    public double calculateSubtotalPrice(ShoppingCart cart) {
        return products.stream()
                .mapToDouble(Product::getTotalPrice).sum();
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public int getTotalItems() {
        return products.stream()
                .mapToInt(Product::getQuantity).sum();
    }

    public void clear() {
        products.clear();
    }

}
