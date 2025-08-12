package com.example.poject_pranfood.JobSeekers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ApplyJobView {

    @FXML
    private ComboBox<String> ApplyAvailJobsComboBox;
    @FXML
    private TextField ResumeTextField;

    @FXML
    public void initialize() {
        // Sample job titles - ideally, load from a shared data provider
        ApplyAvailJobsComboBox.setItems(FXCollections.observableArrayList(
                "Software Engineer",
                "Marketing Officer",
                "Data Analyst",
                "HR Manager"
        ));
    }

    @FXML
    public void OnClickDoneApplyJob() {
        String selectedJob = ApplyAvailJobsComboBox.getValue();
        String resumeContent = ResumeTextField.getText();

        if (selectedJob == null || selectedJob.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please select a job before applying.");
            return;
        }

        if (resumeContent == null || resumeContent.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please paste your resume content.");
            return;
        }

        // Simulate a resume check and application submission
        boolean profileComplete = true; // In real case, verify profile completeness

        if (profileComplete) {
            showAlert(Alert.AlertType.INFORMATION, "Application Submitted",
                    "Your application for '" + selectedJob + "' has been submitted successfully.");
        } else {
            showAlert(Alert.AlertType.ERROR, "Incomplete Profile", "Please complete your profile before applying.");
        }
    }

    // Utility method to show alerts
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
