package com.example.poject_pranfood.BusinessPartners;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;

public class SubmitProposalView
{
    @FXML
    private Label ConfirmationLabel;

    @FXML
    private ComboBox<String> SubmitProposalTenderComboBox;

    @FXML
    private TextArea SubmitProposalTermsTextArea;

    @FXML
    private TextField SubmitProposalTitleTextField;

    private File selectedFile;


    @FXML
    public void initialize() {
        SubmitProposalTenderComboBox.setItems(FXCollections.observableArrayList(
                "T001 - Packaging Supply",
                "T002 - Logistics Support",
                "T003 - Raw Materials"
        ));
    }

    @FXML
    public void OnClickSubmitProposal(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Proposal File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PDF Files", "*.pdf"),
                new FileChooser.ExtensionFilter("Word Documents", "*.docx"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            selectedFile = file;
            ConfirmationLabel.setText("File selected:\n" + file.getName());
        }
    }

    @FXML
    public void OnClickUploadProposalFile(ActionEvent actionEvent) {
        String tender = SubmitProposalTenderComboBox.getValue();
        String title = SubmitProposalTitleTextField.getText();
        String terms = SubmitProposalTermsTextArea.getText();

        if (tender == null || tender.isEmpty() ||
                title == null || title.isBlank() ||
                terms == null || terms.isBlank() ||
                selectedFile == null) {

            showAlert(Alert.AlertType.ERROR, "Please fill in all fields and select a file.");
            return;
        }

        // Simulated saving logic
        ConfirmationLabel.setText("Proposal Submitted\nfor Tender: " + tender);
        showAlert(Alert.AlertType.INFORMATION, "Proposal submitted successfully!");
    }
    private void showAlert(Alert.AlertType type, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(type == Alert.AlertType.ERROR ? "Error" : "Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}