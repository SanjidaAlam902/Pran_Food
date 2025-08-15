package com.example.oopproject.ProductionStaff;

public class GenerateProductionClass {
    private String shift;
    private String productCategory;

    public GenerateProductionClass(String shift, String productCategory) {
        this.shift = shift;
        this.productCategory = productCategory;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "GenerateProductionClass{" +
                "shift='" + shift + '\'' +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}
