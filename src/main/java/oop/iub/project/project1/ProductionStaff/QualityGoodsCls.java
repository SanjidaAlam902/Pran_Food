package oop.iub.project.project1.ProductionStaff;

public class QualityGoodsCls {
    private int batchId;
    private float weightAccuracy;
    private String labelingStatus,packagingSeal,hygieneStatus;

    public QualityGoodsCls(int batchId, float weightAccuracy, String labelingStatus, String packagingSeal, String hygieneStatus) {
        this.batchId = batchId;
        this.weightAccuracy = weightAccuracy;
        this.labelingStatus = labelingStatus;
        this.packagingSeal = packagingSeal;
        this.hygieneStatus = hygieneStatus;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public float getWeightAccuracy() {
        return weightAccuracy;
    }

    public void setWeightAccuracy(float weightAccuracy) {
        this.weightAccuracy = weightAccuracy;
    }

    public String getLabelingStatus() {
        return labelingStatus;
    }

    public void setLabelingStatus(String labelingStatus) {
        this.labelingStatus = labelingStatus;
    }

    public String getPackagingSeal() {
        return packagingSeal;
    }

    public void setPackagingSeal(String packagingSeal) {
        this.packagingSeal = packagingSeal;
    }

    public String getHygieneStatus() {
        return hygieneStatus;
    }

    public void setHygieneStatus(String hygieneStatus) {
        this.hygieneStatus = hygieneStatus;
    }

    @Override
    public String toString() {
        return "QualityGoodsCls{" +
                "batchId=" + batchId +
                ", weightAccuracy=" + weightAccuracy +
                ", labelingStatus='" + labelingStatus + '\'' +
                ", packagingSeal='" + packagingSeal + '\'' +
                ", hygieneStatus='" + hygieneStatus + '\'' +
                '}';
    }
}
