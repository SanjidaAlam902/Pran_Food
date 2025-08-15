package oop.iub.project.project1.Suppliers;

import java.time.LocalDate;

public class TrackDeliveryCls {
    private int deliveryId;
    private String location,status;
    private LocalDate trackDate;

    public TrackDeliveryCls(int deliveryId, String location, String status, LocalDate trackDate) {
        this.deliveryId = deliveryId;
        this.location = location;
        this.status = status;
        this.trackDate = trackDate;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getTrackDate() {
        return trackDate;
    }

    public void setTrackDate(LocalDate trackDate) {
        this.trackDate = trackDate;
    }

    @Override
    public String toString() {
        return "TrackDeliveryCls{" +
                "deliveryId=" + deliveryId +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                ", trackDate=" + trackDate +
                '}';
    }
}
