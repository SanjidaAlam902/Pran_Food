package com.example.poject_pranfood.JobSeekers;

public class Job {
    private String post;
    private String location;
    private int vacancy;
    private String salary;
    private String shift;

    public Job(String post, String location, int vacancy, String salary, String shift) {
        this.post = post;
        this.location = location;
        this.vacancy = vacancy;
        this.salary = salary;
        this.shift = shift;
    }

    public String getPost() { return post; }
    public String getLocation() { return location; }
    public int getVacancy() { return vacancy; }
    public String getSalary() { return salary; }
    public String getShift() { return shift; }
}
