package oop.iub.project.project1.marketingOfficer;

import java.time.LocalDate;

public class LaunchNewProducts {
    private String productName;
    private String catagory;
    private LocalDate launchingDate;
    private String productCode;


    public LaunchNewProducts(String productName, String catagory, LocalDate launchingDate, String productCode) {
        this.productName = productName;
        this.catagory = catagory;
        this.launchingDate = launchingDate;
        this.productCode = productCode;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public LocalDate getLaunchingDate() {
        return launchingDate;
    }

    public void setLaunchingDate(LocalDate launchingDate) {
        this.launchingDate = launchingDate;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    @Override
    public String toString() {
        return "LaunchNewProducts{" +
                "productName='" + productName + '\'' +
                ", catagory='" + catagory + '\'' +
                ", launchingDate=" + launchingDate +
                ", productCode='" + productCode + '\'' +
                '}';
    }
}
