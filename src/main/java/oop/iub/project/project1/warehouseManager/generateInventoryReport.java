package oop.iub.project.project1.warehouseManager;

import java.io.Serializable;
import java.time.LocalDate;

public class generateInventoryReport implements Serializable {
    private String itemName;
    private String itemID;
    private double quantity;
    private LocalDate date;

    public generateInventoryReport(String itemName, String itemID, double quantity, LocalDate date) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.date = date;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "generateInventoryReport{" +
                "itemName='" + itemName + '\'' +
                ", itemID='" + itemID + '\'' +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }
}
