package eci.edu.dosw.furniture_api;

public class IVA extends BillDecorator {
    
    private double ivaPercentage;
    
    public IVA(BillInterface bill, double ivaPercentage) {
        super(bill);
        this.ivaPercentage = ivaPercentage;
    }
    
    public IVA(BillInterface bill) {
        this(bill, 19.0); // IVA en Colombia
    }
    
    @Override
    public void showBill() {
        bill.showBill();
        double baseAmount = bill.billing();
        double ivaAmount = baseAmount * (ivaPercentage / 100);
        System.out.println("IVA (" + ivaPercentage + "%): $" + ivaAmount);
    }
    
    @Override
    public double billing() {
        double baseAmount = bill.billing();
        return baseAmount + (baseAmount * (ivaPercentage / 100));
    }
    
    public double getIvaPercentage() {
        return ivaPercentage;
    }
}