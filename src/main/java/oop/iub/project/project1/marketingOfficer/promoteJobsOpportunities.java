package oop.iub.project.project1.marketingOfficer;

public class promoteJobsOpportunities {
    private String jobTitle;
    private String requiredSkill;
    private String Quualification;
    private double salary;

    public promoteJobsOpportunities(String jobTitle, String requiredSkill, String quualification, double salary) {
        this.jobTitle = jobTitle;
        this.requiredSkill = requiredSkill;
        Quualification = quualification;
        this.salary = salary;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getRequiredSkill() {
        return requiredSkill;
    }

    public void setRequiredSkill(String requiredSkill) {
        this.requiredSkill = requiredSkill;
    }

    public String getQuualification() {
        return Quualification;
    }

    public void setQuualification(String quualification) {
        Quualification = quualification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "promoteJobsOpportunities{" +
                "jobTitle='" + jobTitle + '\'' +
                ", requiredSkill='" + requiredSkill + '\'' +
                ", Quualification='" + Quualification + '\'' +
                ", salary=" + salary +
                '}';
    }
}
