package com.example.poject_pranfood.BusinessPartners;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;

import java.io.File;

public class SampleSubmitView
{
    @FXML private ComboBox<String> SubmitProductSelectContractComboBox;

    private File selectedFile;

    @FXML
    public void initialize() {
        // Load dummy contracts
        SubmitProductSelectContractComboBox.setItems(FXCollections.observableArrayList(
                "C001 - Packaging Supply",
                "C002 - Logistics Support",
                "C003 - IT Support"
        ));
    }

    @FXML
    public void OnClickUploadProductSample(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Product Sample File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png"),
                new FileChooser.ExtensionFilter("PDF Files", "*.pdf"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            selectedFile = file;
            showAlert(Alert.AlertType.INFORMATION, "File Selected: " + file.getName());
        }
    }

    @FXML
    public void OnClickSubmitProductSample(ActionEvent actionEvent) {
        String contract = SubmitProductSelectContractComboBox.getValue();

        if (contract == null || contract.isEmpty() || selectedFile == null) {
            showAlert(Alert.AlertType.ERROR, "Please select a contract and upload a file.");
            return;
        }

        // Simulated save
        showAlert(Alert.AlertType.INFORMATION, "Sample submitted for review for contract: " + contract);

    }
    private void showAlert(Alert.AlertType type, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(type == Alert.AlertType.ERROR ? "Error" : "Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}