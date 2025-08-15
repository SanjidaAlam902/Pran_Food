package oop.iub.project.project1.Suppliers;

import java.io.Serializable;
import java.time.LocalDate;

public class ReviewDeliveriesCls implements Serializable {
    private int supplierID;
    private String materialType, status;
    private LocalDate deliverydate;

    public ReviewDeliveriesCls(int supplierID, String materialType, String status, LocalDate deliverydate) {
        this.supplierID = supplierID;
        this.materialType = materialType;
        this.status = status;
        this.deliverydate = deliverydate;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(LocalDate deliverydate) {
        this.deliverydate = deliverydate;
    }

    @Override
    public String toString() {
        return "ReviewDeliveriesCls{" +
                "supplierID=" + supplierID +
                ", materialType='" + materialType + '\'' +
                ", status='" + status + '\'' +
                ", deliverydate=" + deliverydate +
                '}';
    }
}
