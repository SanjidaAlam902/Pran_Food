package com.example.poject_pranfood.JobSeekers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MyApplicationView {

    @FXML
    private TableView<Application> MyApplicationTableView;
    @FXML
    private TableColumn<Application, String> MyApplicationPostTableColumn;
    @FXML
    private TableColumn<Application, String> MyApplicationLocationTableColumn;
    @FXML
    private TableColumn<Application, String> MyApplicationSalaryTableColumn;
    @FXML
    private TableColumn<Application, String> MyApplicationShiftTableColumn;
    @FXML
    private TableColumn<Application, String> MyApplicationStatusTableColumn;

    // Inner class to represent applications
    public static class Application {
        private final String post;
        private final String location;
        private final String salary;
        private final String shift;
        private final String status;

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

    // Sample application data
    private final ObservableList<Application> myApplications = FXCollections.observableArrayList(
            new Application("Software Engineer", "Dhaka", "50,000 BDT", "Day", "Pending"),
            new Application("Marketing Officer", "Chittagong", "40,000 BDT", "Night", "Interview Scheduled"),
            new Application("Data Analyst", "Dhaka", "45,000 BDT", "Day", "Rejected")
    );

    @FXML
    public void initialize() {
        MyApplicationPostTableColumn.setCellValueFactory(new PropertyValueFactory<>("post"));
        MyApplicationLocationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        MyApplicationSalaryTableColumn.setCellValueFactory(new PropertyValueFactory<>("salary"));
        MyApplicationShiftTableColumn.setCellValueFactory(new PropertyValueFactory<>("shift"));
        MyApplicationStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @FXML
    public void OnClickLoadMyApplication() {
        MyApplicationTableView.setItems(myApplications);
    }
}