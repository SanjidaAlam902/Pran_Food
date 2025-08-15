package com.example.oopproject.Suppliers;

import java.time.LocalDate;

public class SubmitSupplyReqCls {
    private String materialType;
    private LocalDate deliveryDate;
    private int quantity;

    public SubmitSupplyReqCls(String materialType, LocalDate deliveryDate, int quantity) {
        this.materialType = materialType;
        this.deliveryDate = deliveryDate;
        this.quantity = quantity;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SubmitSupplyReqCls{" +
                "materialType='" + materialType + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", quantity=" + quantity +
                '}';
    }
}
