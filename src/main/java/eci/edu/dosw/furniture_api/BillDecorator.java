package eci.edu.dosw.furniture_api;


public abstract class BillDecorator implements BillInterface {
    
    protected BillInterface bill;

    public BillDecorator(BillInterface bill) {
        this.bill = bill;
    }

    @Override
    public void showBill() {
        bill.showBill();
    }

    @Override
    public double billing() {
        return bill.billing();
    }
}