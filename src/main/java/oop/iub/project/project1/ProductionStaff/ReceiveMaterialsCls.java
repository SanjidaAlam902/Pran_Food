package com.example.oopproject.ProductionStaff;

import java.io.Serializable;

public class ReceiveMaterialsCls implements Serializable {
    private String supplierName, materialType;
    private Float quantity;

    public ReceiveMaterialsCls(String supplierName, String materialType, Float quantity) {
        this.supplierName = supplierName;
        this.materialType = materialType;
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

}
