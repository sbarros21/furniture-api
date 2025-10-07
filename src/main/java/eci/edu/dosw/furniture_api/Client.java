package eci.edu.dosw.furniture_api;


public class Client {
    private String id;
    private String name;
    private ShoppingCart cart;
    private String address;

    public Client(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cart = new ShoppingCart();
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

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Client{id='%s', name='%s', address='%s'}", id, name, address);
    }
}