package com.example.poject_pranfood.BusinessPartners;

public class Payment {
    private String invoiceNo;
    private double amount;
    private String status;
    private String deadline;

    public Payment(String invoiceNo, double amount, String status, String deadline) {
        this.invoiceNo = invoiceNo;
        this.amount = amount;
        this.status = status;
        this.deadline = deadline;
    }

    public String getInvoiceNo() { return invoiceNo; }
    public void setInvoiceNo(String invoiceNo) { this.invoiceNo = invoiceNo; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDeadline() { return deadline; }
    public void setDeadline(String deadline) { this.deadline = deadline; }
}
