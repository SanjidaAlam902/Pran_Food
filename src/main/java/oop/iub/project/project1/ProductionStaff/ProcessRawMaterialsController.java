package com.example.oopproject.ProductionStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ProcessRawMaterialsController
{
    @javafx.fxml.FXML
    private TextField batchIdPRMTextField;
    @javafx.fxml.FXML
    private TextField rawMaterialPRMTextField;
    @javafx.fxml.FXML
    private TextArea productionStatusValidateLabel;
    @javafx.fxml.FXML
    private ComboBox<String> processingTimeCb;

    @javafx.fxml.FXML
    public void initialize() {
        processingTimeCb.getItems().addAll("Short(1-3 Hours)", "Long(4-7 Hours)");
    }

    @javafx.fxml.FXML
    public void processMaterialsOnClick(ActionEvent actionEvent) {
        if (rawMaterialPRMTextField.getText().trim().isEmpty()){
            productionStatusValidateLabel.setText("Please enter Raw Material");
            return;
        }
        if (processingTimeCb.getValue() == null) {
            productionStatusValidateLabel.setText("Please select an Option.");
            return;
        }
        if (batchIdPRMTextField.getText().trim().isEmpty()){
            productionStatusValidateLabel.setText("Please enter BatchID");
            return;
        }

        String rawMaterial = rawMaterialPRMTextField.getText();
        int batchID =Integer.parseInt(batchIdPRMTextField.getText());
        String processingTime =processingTimeCb.getValue();

        ProcessMaterialsCls pm = new ProcessMaterialsCls(rawMaterial,batchID,processingTime);
        productionStatusValidateLabel.setText(pm.toString());
    }
}