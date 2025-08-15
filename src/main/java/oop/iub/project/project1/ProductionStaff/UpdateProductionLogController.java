package com.example.oopproject.ProductionStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class UpdateProductionLogController
{
    @javafx.fxml.FXML
    private TextArea descriptionUpdateProLogLabel;
    @javafx.fxml.FXML
    private DatePicker updateProductionLogDatePIcker;
    @javafx.fxml.FXML
    private TextField batchIdUPLTextField;
    @javafx.fxml.FXML
    private ComboBox<String> updateProLogCBox;

    @javafx.fxml.FXML
    public void initialize() {
        updateProLogCBox.getItems().addAll("Success", "Failure");
    }

    @javafx.fxml.FXML
    public void saveEntryUPLOnClick(ActionEvent actionEvent) {
        if (batchIdUPLTextField.getText().trim().isEmpty()) {
            descriptionUpdateProLogLabel.setText("Please enter BatchID");
            return;
        }
        if (updateProLogCBox.getValue() == null) {
            descriptionUpdateProLogLabel.setText("Please select an Option.");
            return;
        }
        if (updateProductionLogDatePIcker.getValue() == null) {
            descriptionUpdateProLogLabel.setText("Please select an Option.");
            return;
        }
        LocalDate date = updateProductionLogDatePIcker.getValue();
        int batchID =Integer.parseInt(batchIdUPLTextField.getText());
        String outcome =updateProLogCBox.getValue();

        ProductionLog pl = new ProductionLog(date,batchID,outcome);
        descriptionUpdateProLogLabel.setText(pl.toString());
    }
}