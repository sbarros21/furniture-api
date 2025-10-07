package eci.edu.dosw.furniture_api;

public class TestFurnitureSystem {
    public static void main(String[] args) {
        // 1. Crear productos
        Product sofa = new Product("001", "Sofá Clásico", 500000, 1, "Sofa", "Clasico");
        Product silla = new Product("002", "Silla Moderna", 150000, 1, "Silla", "Moderna");
        Product mesa = new Product("003", "Mesa Minimalista", 300000, 1, "Mesa", "Minimalista");

        // 2. Crear cliente
        Client cliente = new Client("C001", "Juan Pérez", "Calle 123 #45-67");
        
        // 3. Crear carrito y agregar productos
        ShoppingCart carrito = new ShoppingCart();
        carrito.addItem(sofa);
        carrito.addItem(silla);
        carrito.addItem(mesa);
        
        System.out.println("=== CONTENIDO DEL CARRITO ===");
        System.out.println(carrito);
        System.out.println("Subtotal: $" + carrito.calculateSubtotalPrice(carrito));
        System.out.println();
        
        // 4. Crear factura básica
        Bill facturaBasica = new Bill("1", cliente, carrito);
        
        // 5. Aplicar decoradores
        BillInterface conIVA = new IVA(facturaBasica);
        BillInterface conDescuento = new Discount(conIVA, 10.0, "Descuento cliente frecuente");
        BillInterface facturaFinal = new Delivery(conDescuento, 25000.0, "Envío express");
        
        // 6. Mostrar factura completa
        System.out.println();
        System.out.println("=== FACTURA FINAL ===");
        facturaFinal.showBill();
        System.out.println("========================================");
        System.out.println("TOTAL A PAGAR: $" + String.format("%.2f", facturaFinal.billing()));
    }
}