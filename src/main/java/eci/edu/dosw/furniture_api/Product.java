package eci.edu.dosw.furniture_api;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private String category;
    private String style;

    public Product() {}

    public Product(String id, String name, double price, int quantity, String category, String style) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.style = style;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("Product{id='%s', name='%s', price=%.2f, quantity=%d, category='%s', style='%s'}", 
        id, name, price, quantity, category, style);
    }
}