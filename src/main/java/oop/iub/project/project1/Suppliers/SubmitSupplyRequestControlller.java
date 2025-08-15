package com.example.oopproject.Suppliers;

import com.example.oopproject.ProductionStaff.ProductionLog;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class SubmitSupplyRequestControlller
{
    @javafx.fxml.FXML
    private DatePicker deliveryDateSNRMSDatePicker;
    @javafx.fxml.FXML
    private Label submitRawMaterialStatus;
    @javafx.fxml.FXML
    private TextField materialTypeSNRMSTextField;
    @javafx.fxml.FXML
    private TextField quantitySNRMSTextField;
    @javafx.fxml.FXML
    private TextArea newRqTArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitRawMaterialOnClick(ActionEvent actionEvent) {
        if (materialTypeSNRMSTextField.getText().trim().isEmpty()) {
            submitRawMaterialStatus.setText("Please enter BatchID");
            return;
        }
        if (quantitySNRMSTextField.getText().trim().isEmpty()) {
            submitRawMaterialStatus.setText("Please enter BatchID");
            return;
        }
        if (deliveryDateSNRMSDatePicker.getValue() == null) {
            submitRawMaterialStatus.setText("Please select an Option.");
            return;
        }
        String materialType =materialTypeSNRMSTextField.getText();
        LocalDate deliveryDate = deliveryDateSNRMSDatePicker.getValue();
        int quantity =Integer.parseInt(quantitySNRMSTextField.getText());

        SubmitSupplyReqCls ssr = new SubmitSupplyReqCls(materialType,deliveryDate,quantity);
        newRqTArea.setText(ssr.toString());
    }
}