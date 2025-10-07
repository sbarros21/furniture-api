package eci.edu.dosw.furniture_api;

public class Delivery extends BillDecorator {
    
    private double deliveryCost;
    private String deliveryType;
    
    public Delivery(BillInterface bill, double deliveryCost, String deliveryType) {
        super(bill);
        this.deliveryCost = deliveryCost;
        this.deliveryType = deliveryType;
    }
    
    public Delivery(BillInterface bill, double deliveryCost) {
        this(bill, deliveryCost, "Envío estándar");
    }
    
    @Override
    public void showBill() {
        bill.showBill();
        System.out.println(deliveryType + ": $" + deliveryCost);
    }
    
    @Override
    public double billing() {
        return bill.billing() + deliveryCost;
    }
    
    public double getDeliveryCost() {
        return deliveryCost;
    }
    
    public String getDeliveryType() {
        return deliveryType;
    }
}