package com.example.poject_pranfood.JobSeekers;

public class Application {
    private String post;
    private String location;
    private String salary;
    private String shift;
    private String status;

    public Application(String post, String location, String salary, String shift, String status) {
        this.post = post;
        this.location = location;
        this.salary = salary;
        this.shift = shift;
        this.status = status;
    }

    public String getPost() { return post; }
    public String getLocation() { return location; }
    public String getSalary() { return salary; }
    public String getShift() { return shift; }
    public String getStatus() { return status; }
}
