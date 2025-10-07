package eci.edu.dosw.furniture_api;

public class Discount extends BillDecorator {
    
    private double discountPercentage;
    private String discountReason;
    
    public Discount(BillInterface bill, double discountPercentage, String discountReason) {
        super(bill);
        this.discountPercentage = discountPercentage;
        this.discountReason = discountReason;
    }
    
    public Discount(BillInterface bill, double discountPercentage) {
        this(bill, discountPercentage, "Descuento aplicado");
    }
    
    @Override
    public void showBill() {
        bill.showBill();
        double baseAmount = bill.billing();
        double discountAmount = baseAmount * (discountPercentage / 100);
        System.out.println(discountReason + " (-" + discountPercentage + "%): -$" + discountAmount);
    }
    
    @Override
    public double billing() {
        double baseAmount = bill.billing();
        return baseAmount - (baseAmount * (discountPercentage / 100));
    }
    
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    
    public String getDiscountReason() {
        return discountReason;
    }
}
