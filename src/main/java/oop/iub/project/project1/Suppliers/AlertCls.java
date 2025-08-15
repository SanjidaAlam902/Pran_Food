package com.example.oopproject.Suppliers;

import java.time.LocalDate;

public class AlertCls {
    private String status,alertType;
    private int deliveryID;
    private LocalDate alertDate;

    public AlertCls(String status, String alertType, int deliveryID, LocalDate alertDate) {
        this.status = status;
        this.alertType = alertType;
        this.deliveryID = deliveryID;
        this.alertDate = alertDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public int getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(int deliveryID) {
        this.deliveryID = deliveryID;
    }

    public LocalDate getAlertDate() {
        return alertDate;
    }

    public void setAlertDate(LocalDate alertDate) {
        this.alertDate = alertDate;
    }

    @Override
    public String toString() {
        return "AlertCls{" +
                "status='" + status + '\'' +
                ", alertType='" + alertType + '\'' +
                ", deliveryID=" + deliveryID +
                ", alertDate=" + alertDate +
                '}';
    }
}
