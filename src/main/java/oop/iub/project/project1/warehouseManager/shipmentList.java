package oop.iub.project.project1.warehouseManager;

import java.io.Serializable;
import java.time.LocalDate;

public class shipmentList implements Serializable {
    private String shipmentName;
    private Double shippingOrderNumber;
    private LocalDate shippingDate;
    private String destination;


    public shipmentList(String shipmentName, Double shippingOrderNumber, LocalDate shippingDate, String destination) {
        this.shipmentName = shipmentName;
        this.shippingOrderNumber = shippingOrderNumber;
        this.shippingDate = shippingDate;
        this.destination = destination;
    }

    public String getShipmentName() {
        return shipmentName;
    }

    public void setShipmentName(String shipmentName) {
        this.shipmentName = shipmentName;
    }

    public Double getShippingOrderNumber() {
        return shippingOrderNumber;
    }

    public void setShippingOrderNumber(Double shippingOrderNumber) {
        this.shippingOrderNumber = shippingOrderNumber;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "shipmentList{" +
                "shipmentName='" + shipmentName + '\'' +
                ", shippingOrderNumber=" + shippingOrderNumber +
                ", shippingDate=" + shippingDate +
                ", destination='" + destination + '\'' +
                '}';
    }
}
