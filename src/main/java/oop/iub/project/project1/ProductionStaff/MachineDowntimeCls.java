package oop.iub.project.project1.ProductionStaff;

import java.time.LocalDate;

public class MachineDowntimeCls {
    private int machineId;
    private LocalDate startTime, endTime;
    private String technician;
    private String downtimeReason;

    public MachineDowntimeCls(int machineId, LocalDate startTime, LocalDate endTime, String technician, String downtimeReason) {
        this.machineId = machineId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.technician = technician;
        this.downtimeReason = downtimeReason;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public String getDowntimeReason() {
        return downtimeReason;
    }

    public void setDowntimeReason(String downtimeReason) {
        this.downtimeReason = downtimeReason;
    }

    @Override
    public String toString() {
        return "MachineDowntimeCls{" +
                "machineId=" + machineId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", technician='" + technician + '\'' +
                ", downtimeReason='" + downtimeReason + '\'' +
                '}';
    }
}
