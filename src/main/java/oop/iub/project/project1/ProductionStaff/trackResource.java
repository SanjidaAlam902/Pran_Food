package com.example.oopproject.ProductionStaff;

import java.time.LocalDate;

public class trackResource {
    private String resourceType;
    private int batchID;
    private LocalDate timePeriod;

    public trackResource(String resourceType, int batchID, LocalDate timePeriod) {
        this.resourceType = resourceType;
        this.batchID = batchID;
        this.timePeriod = timePeriod;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public int getBatchID() {
        return batchID;
    }

    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }

    public LocalDate getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(LocalDate timePeriod) {
        this.timePeriod = timePeriod;
    }

    @Override
    public String toString() {
        return "trackResource{" +
                "resourceType='" + resourceType + '\'' +
                ", batchID=" + batchID +
                ", timePeriod=" + timePeriod +
                '}';
    }
}
