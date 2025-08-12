package com.example.poject_pranfood.JobSeekers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class BrowseJobViewSeeker {

    // ====== FXML UI Components ======
    @FXML
    private TableView<Job> AllAvailJobsTableView;
    @FXML
    private TableColumn<Job, String> AllAvailJobsPostTableColumn;
    @FXML
    private TableColumn<Job, String> AllAvailJobsLocationTableColumn;
    @FXML
    private TableColumn<Job, Integer> AllAvailJobsVacancyTableColumn;
    @FXML
    private TableColumn<Job, String> AllAvailJobsSalaryTableColumn;
    @FXML
    private TableColumn<Job, String> AllAvailJobsShiftTableColumn;

    @FXML
    private TableView<Job> FilterJobsTableView;
    @FXML
    private TableColumn<Job, String> FilterJobsPostTableColumn;
    @FXML
    private TableColumn<Job, String> FilterJobsLocationTableColumn;
    @FXML
    private TableColumn<Job, Integer> FilterJobsVacancyTableColumn;
    @FXML
    private TableColumn<Job, String> FilterJobsSalaryTableColumn;
    @FXML
    private TableColumn<Job, String> FilterJobsShiftTableColumn;

    @FXML
    private ComboBox<String> FilterLocationComboBox;
    @FXML
    private ComboBox<String> FilterRoleComboBox;

    // ====== Job Data Model ======
    public static class Job {
        private final String post;
        private final String location;
        private final int vacancy;
        private final String salary;
        private final String shift;

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

    // ====== Sample Data ======
    private ObservableList<Job> allJobs = FXCollections.observableArrayList(
            new Job("Software Engineer", "Dhaka", 5, "50,000 BDT", "Day"),
            new Job("Marketing Officer", "Chittagong", 3, "40,000 BDT", "Night"),
            new Job("Data Analyst", "Dhaka", 2, "45,000 BDT", "Day"),
            new Job("HR Manager", "Sylhet", 1, "55,000 BDT", "Day")
    );

    // ====== Initialization ======
    @FXML
    public void initialize() {
        // Setup All Available Jobs Table
        AllAvailJobsPostTableColumn.setCellValueFactory(new PropertyValueFactory<>("post"));
        AllAvailJobsLocationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        AllAvailJobsVacancyTableColumn.setCellValueFactory(new PropertyValueFactory<>("vacancy"));
        AllAvailJobsSalaryTableColumn.setCellValueFactory(new PropertyValueFactory<>("salary"));
        AllAvailJobsShiftTableColumn.setCellValueFactory(new PropertyValueFactory<>("shift"));

        // Setup Filtered Jobs Table
        FilterJobsPostTableColumn.setCellValueFactory(new PropertyValueFactory<>("post"));
        FilterJobsLocationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        FilterJobsVacancyTableColumn.setCellValueFactory(new PropertyValueFactory<>("vacancy"));
        FilterJobsSalaryTableColumn.setCellValueFactory(new PropertyValueFactory<>("salary"));
        FilterJobsShiftTableColumn.setCellValueFactory(new PropertyValueFactory<>("shift"));

        // Setup Filter ComboBoxes
        FilterLocationComboBox.setItems(FXCollections.observableArrayList("Dhaka", "Chittagong", "Sylhet"));
        FilterRoleComboBox.setItems(FXCollections.observableArrayList(
                "Software Engineer", "Marketing Officer", "Data Analyst", "HR Manager"
        ));
    }

    // ====== Button Actions ======
    @FXML
    public void OnClickLoadAllJobs() {
        AllAvailJobsTableView.setItems(allJobs);
    }

    @FXML
    public void OnClickFilterJobs() {
        String selectedLocation = FilterLocationComboBox.getValue();
        String selectedRole = FilterRoleComboBox.getValue();

        ObservableList<Job> filteredList = FXCollections.observableArrayList();

        for (Job job : allJobs) {
            boolean locationMatches = (selectedLocation == null || selectedLocation.isEmpty()) || job.getLocation().equals(selectedLocation);
            boolean roleMatches = (selectedRole == null || selectedRole.isEmpty()) || job.getPost().equals(selectedRole);

            if (locationMatches && roleMatches) {
                filteredList.add(job);
            }
        }

        if (filteredList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Results");
            alert.setHeaderText(null);
            alert.setContentText("No matching jobs found.");
            alert.showAndWait();
        }

        FilterJobsTableView.setItems(filteredList);
    }
}
