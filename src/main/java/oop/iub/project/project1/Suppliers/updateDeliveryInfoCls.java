package com.example.oopproject.Suppliers;

import java.time.LocalDate;

public class updateDeliveryInfoCls {
    private LocalDate deliveryTime;
    private int vehicleNumber, triverContact;
    private String status;

    public updateDeliveryInfoCls(LocalDate deliveryTime, int vehicleNumber, int triverContact, String status) {
        this.deliveryTime = deliveryTime;
        this.vehicleNumber = vehicleNumber;
        this.triverContact = triverContact;
        this.status = status;
    }

    public LocalDate getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDate deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getTriverContact() {
        return triverContact;
    }

    public void setTriverContact(int triverContact) {
        this.triverContact = triverContact;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "updateDeliveryInfoCls{" +
                "deliveryTime=" + deliveryTime +
                ", vehicleNumber=" + vehicleNumber +
                ", triverContact=" + triverContact +
                ", status='" + status + '\'' +
                '}';
    }
}
