package com.example.poject_pranfood.BusinessPartners;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DownloadReportView {

    @FXML
    private ComboBox<String> ReportDownloadTypeComboBox;

    @FXML
    public void initialize() {
        // Populate the ComboBox with report types
        ReportDownloadTypeComboBox.setItems(FXCollections.observableArrayList(
                "Financial",
                "Performance",
                "Sales",
                "Inventory"
        ));

        // Optionally set a default value
        ReportDownloadTypeComboBox.getSelectionModel().selectFirst();
    }

    @FXML
    private void OnClickDownloadReport() {
        String selectedReportType = ReportDownloadTypeComboBox.getSelectionModel().getSelectedItem();

        if (selectedReportType == null) {
            showAlert("Please select a report type before downloading.");
            return;
        }


        showAlert("Downloading " + selectedReportType + " report...");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Download Report");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
