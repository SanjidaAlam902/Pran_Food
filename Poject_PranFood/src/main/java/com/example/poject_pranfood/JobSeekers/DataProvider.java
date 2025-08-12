package com.example.poject_pranfood.JobSeekers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataProvider {

    public static ObservableList<Job> getJobs() {
        return FXCollections.observableArrayList(
                new Job("Software Engineer", "Dhaka", 5, "50,000 BDT", "Day"),
                new Job("Marketing Officer", "Chittagong", 3, "40,000 BDT", "Night"),
                new Job("Data Analyst", "Dhaka", 2, "45,000 BDT", "Day"),
                new Job("HR Manager", "Sylhet", 1, "55,000 BDT", "Day")
        );
    }

    public static ObservableList<Application> getApplications() {
        return FXCollections.observableArrayList(
                new Application("Software Engineer", "Dhaka", "50,000 BDT", "Day", "Pending"),
                new Application("Marketing Officer", "Chittagong", "40,000 BDT", "Night", "Interview Scheduled"),
                new Application("Data Analyst", "Dhaka", "45,000 BDT", "Day", "Rejected")
        );
    }
}
