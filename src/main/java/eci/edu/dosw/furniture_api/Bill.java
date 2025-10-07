package eci.edu.dosw.furniture_api;

import java.time.LocalDate;


public class Bill implements BillInterface {
    
    private Client client;
    private ShoppingCart products;
    private double subtotal;
    private double total;
    private LocalDate billDate;
    private String id;

    public Bill(String id, Client client, ShoppingCart products) {
        this.id = id;
        this.client = client;
        this.products = products;
        this.subtotal = products.calculateSubtotalPrice(products);
        this.total = this.subtotal;
        this.billDate = LocalDate.now();
    }

    public double calculateTotalPrice(ShoppingCart cart) {
        return cart.calculateSubtotalPrice(cart);
    }

    @Override
    public void showBill() {
        System.out.println("----------------------");
        System.out.println("# Factura: " + id);
        System.out.println();
        System.out.println("Cliente: " + client.getName());
        System.out.println();
        System.out.println("Fecha: " + billDate);
        System.out.println();
        System.out.println("Productos:");
        for (Product product : products.getProducts()) {
            System.out.println("- " + product.getName() + " (Cantidad: " + product.getQuantity() + ") - $" + (product.getPrice() * product.getQuantity()));
        }
        System.out.println();
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total: " + total);
        System.out.println("----------------------");
        System.out.println();
        System.out.println("Gracias por su compra! :D");
        System.out.println();
    }

    @Override
    public double billing() {
        return total;
    }

    // Getters y Setters
    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ShoppingCart getProducts() {
        return products;
    }

    public void setProducts(ShoppingCart products) {
        this.products = products;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String newId) {
        this.id = newId;
    }
}