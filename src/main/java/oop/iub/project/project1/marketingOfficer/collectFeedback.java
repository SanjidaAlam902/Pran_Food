package oop.iub.project.project1.marketingOfficer;

public class collectFeedback {
    private String productName;
    private String rating;

    public collectFeedback(String productName, String rating) {
        this.productName = productName;
        this.rating = rating;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "collectFeedback{" +
                "productName='" + productName + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
