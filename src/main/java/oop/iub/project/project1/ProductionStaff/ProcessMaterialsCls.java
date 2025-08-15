package com.example.oopproject.ProductionStaff;

public class ProcessMaterialsCls {
    private String rawMaterial;
    private int batchID;
    private String processingTime;

    public ProcessMaterialsCls(String rawMaterial, int batchID, String processingTime) {
        this.rawMaterial = rawMaterial;
        this.batchID = batchID;
        this.processingTime = processingTime;
    }

    public String getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(String rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public int getBatchID() {
        return batchID;
    }

    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }

    public String getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
    }

    @Override
    public String toString() {
        return "ProcessMaterialsCls{" +
                "rawMaterial='" + rawMaterial + '\'' +
                ", batchID=" + batchID +
                ", processingTime='" + processingTime + '\'' +
                '}';
    }
}
