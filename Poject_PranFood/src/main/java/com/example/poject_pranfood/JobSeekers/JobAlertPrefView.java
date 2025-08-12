package com.example.poject_pranfood.JobSeekers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class JobAlertPrefView {

    @FXML
    private ComboBox<String> JobPrefDepartComboBox;
    @FXML
    private ComboBox<String> JobPrefLocationComboBox;
    @FXML
    private Label PrefConfirmAlert;

    @FXML
    public void initialize() {
        // Sample departments
        JobPrefDepartComboBox.setItems(FXCollections.observableArrayList(
                "IT",
                "Marketing",
                "Finance",
                "Production",
                "HR"
        ));

        // Sample locations
        JobPrefLocationComboBox.setItems(FXCollections.observableArrayList(
                "Dhaka",
                "Chittagong",
                "Sylhet",
                "Khulna"
        ));
    }

    @FXML
    public void OnClickSavePref() {
        String selectedDept = JobPrefDepartComboBox.getValue();
        String selectedLocation = JobPrefLocationComboBox.getValue();

        if (selectedDept == null || selectedDept.isEmpty()) {
            PrefConfirmAlert.setText("⚠ Please select a department.");
            return;
        }

        if (selectedLocation == null || selectedLocation.isEmpty()) {
            PrefConfirmAlert.setText("⚠ Please select a location.");
            return;
        }

        // Simulate saving preferences
        PrefConfirmAlert.setText("✅ Preferences saved: Department - " +
                selectedDept + ", Location - " + selectedLocation +
                ". You will receive job alerts when matches are found.");
    }
}