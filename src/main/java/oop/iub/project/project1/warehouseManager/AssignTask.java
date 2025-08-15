package oop.iub.project.project1.warehouseManager;

import java.time.LocalDate;

public class AssignTask {
    private String staffName;
    private String taskName;
    private String Location;
    private LocalDate deadline;

    public AssignTask(String staffName, String taskName, String location, LocalDate deadline) {
        this.staffName = staffName;
        this.taskName = taskName;
        Location = location;
        this.deadline = deadline;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "assignTask{" +
                "staffName='" + staffName + '\'' +
                ", taskName='" + taskName + '\'' +
                ", Location='" + Location + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
