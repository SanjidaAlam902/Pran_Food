package oop.iub.project.project1.warehouseManager;

import java.time.LocalDate;

public class inventoryLoss {
    private String itemName;
    private double quantity;
    private LocalDate dateOfLoss;
    private String reasonForLoss;

    public inventoryLoss(String itemName, double quantity, LocalDate dateOfLoss, String reasonForLoss) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.dateOfLoss = dateOfLoss;
        this.reasonForLoss = reasonForLoss;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDateOfLoss() {
        return dateOfLoss;
    }

    public void setDateOfLoss(LocalDate dateOfLoss) {
        this.dateOfLoss = dateOfLoss;
    }

    public String getReasonForLoss() {
        return reasonForLoss;
    }

    public void setReasonForLoss(String reasonForLoss) {
        this.reasonForLoss = reasonForLoss;
    }

    @Override
    public String toString() {
        return "inventoryLoss{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", dateOfLoss=" + dateOfLoss +
                ", reasonForLoss='" + reasonForLoss + '\'' +
                '}';
    }
}
