package com.example.poject_pranfood.BusinessPartners;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class NegotiateTermsView
{
    @FXML private ComboBox<String> NegotiateTermsContractSelectComboBox;
    @FXML private TextArea NegotiateMessageTextArea;

    @FXML
    public void initialize() {
        // Load sample contracts
        NegotiateTermsContractSelectComboBox.setItems(FXCollections.observableArrayList(
                "C001 - Packaging Supply",
                "C002 - Logistics Support",
                "C003 - IT Support"
        ));
    }

    @FXML
    public void OnClickSendNegotiateMessage(ActionEvent actionEvent) {
        String contract = NegotiateTermsContractSelectComboBox.getValue();
        String message = NegotiateMessageTextArea.getText();

        if (contract == null || contract.isEmpty() || message == null || message.isBlank()) {
            showAlert(Alert.AlertType.ERROR, "Please select a contract and enter your message.");
            return;
        }

        // Simulated message sending
        showAlert(Alert.AlertType.INFORMATION, "Message sent to procurement team for: " + contract);
        NegotiateMessageTextArea.clear();
    }
    private void showAlert(Alert.AlertType type, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(type == Alert.AlertType.ERROR ? "Error" : "Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}