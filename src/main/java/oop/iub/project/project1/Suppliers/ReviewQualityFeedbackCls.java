package oop.iub.project.project1.Suppliers;

public class ReviewQualityFeedbackCls {
    private int deliveryID;
    private float qualityScore;
    private String materialType;

    public ReviewQualityFeedbackCls(float qualityScore, String materialType, int deliveryID) {
        this.qualityScore = qualityScore;
        this.materialType = materialType;
        this.deliveryID = deliveryID;
    }

    public int getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(int deliveryID) {
        this.deliveryID = deliveryID;
    }

    public float getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(float qualityScore) {
        this.qualityScore = qualityScore;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    @Override
    public String toString() {
        return "ReviewQualityFeedbackCls{" +
                "deliveryID=" + deliveryID +
                ", qualityScore=" + qualityScore +
                ", materialType='" + materialType + '\'' +
                '}';
    }
}
