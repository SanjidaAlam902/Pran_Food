package oop.iub.project.project1.marketingOfficer;

public class makeAd {
    private String productName;
    private String productID;

    public makeAd(String productID, String id) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
        return "makeAd{" +
                "productName='" + productName + '\'' +
                ", productID='" + productID + '\'' +
                '}';
    }
}
