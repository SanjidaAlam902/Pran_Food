package oop.iub.project.project1.warehouseManager;

import java.time.LocalDate;

public class maintainSafety {
    private String name;
    private LocalDate inspectionDate;
    private String emergencyExitsUnblocked;
    private String firstAidKitsStocked;
    private String fireExtinguishersFunctional;


    public maintainSafety(String name, LocalDate inspectionDate, String emergencyExitsUnblocked, String firstAidKitsStocked, String fireExtinguishersFunctional) {
        this.name = name;
        this.inspectionDate = inspectionDate;
        this.emergencyExitsUnblocked = emergencyExitsUnblocked;
        this.firstAidKitsStocked = firstAidKitsStocked;
        this.fireExtinguishersFunctional = fireExtinguishersFunctional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getEmergencyExitsUnblocked() {
        return emergencyExitsUnblocked;
    }

    public void setEmergencyExitsUnblocked(String emergencyExitsUnblocked) {
        this.emergencyExitsUnblocked = emergencyExitsUnblocked;
    }

    public String getFirstAidKitsStocked() {
        return firstAidKitsStocked;
    }

    public void setFirstAidKitsStocked(String firstAidKitsStocked) {
        this.firstAidKitsStocked = firstAidKitsStocked;
    }

    public String getFireExtinguishersFunctional() {
        return fireExtinguishersFunctional;
    }

    public void setFireExtinguishersFunctional(String fireExtinguishersFunctional) {
        this.fireExtinguishersFunctional = fireExtinguishersFunctional;
    }

    @Override
    public String toString() {
        return "maintainSafety{" +
                "name='" + name + '\'' +
                ", inspectionDate=" + inspectionDate +
                ", emergencyExitsUnblocked='" + emergencyExitsUnblocked + '\'' +
                ", firstAidKitsStocked='" + firstAidKitsStocked + '\'' +
                ", fireExtinguishersFunctional='" + fireExtinguishersFunctional + '\'' +
                '}';
    }
}
