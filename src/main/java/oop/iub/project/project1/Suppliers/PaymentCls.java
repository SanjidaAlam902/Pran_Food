package oop.iub.project.project1.Suppliers;

public class PaymentCls {
    private  String paymentStatus;
    private int paymentID;
    private float amount;

    public PaymentCls(String paymentStatus, int paymentID, Float amount) {
        this.paymentStatus = paymentStatus;
        this.paymentID = paymentID;
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentCls{" +
                "paymentStatus='" + paymentStatus + '\'' +
                ", paymentID=" + paymentID +
                ", amount=" + amount +
                '}';
    }
}
