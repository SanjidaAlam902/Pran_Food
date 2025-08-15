package oop.iub.project.project1.marketingOfficer;

public class RunPromotionAndDiscount {
    private String productName;
    private String discountCode;


    public RunPromotionAndDiscount(String productName, String discountCode) {
        this.productName = productName;
        this.discountCode = discountCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    @Override
    public String toString() {
        return "RunPromotionAndDiscount{" +
                "productName='" + productName + '\'' +
                ", discountCode='" + discountCode + '\'' +
                '}';
    }
}
