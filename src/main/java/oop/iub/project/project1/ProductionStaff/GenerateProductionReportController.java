package com.example.oopproject.ProductionStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class GenerateProductionReportController
{
    @javafx.fxml.FXML
    private TextField productCategoryGPRTextField;
    @javafx.fxml.FXML
    private TextArea productionGenerateValidateStatus;
    @javafx.fxml.FXML
    private ComboBox<String> shiftCBox;

    @javafx.fxml.FXML
    public void initialize() {
        shiftCBox.getItems().addAll("Morning","Evening","Night");
    }

    @javafx.fxml.FXML
    public void generateReportOnClick(ActionEvent actionEvent) {
        if(productCategoryGPRTextField.getText().trim().isEmpty()){
            productionGenerateValidateStatus.setText("Enter product category");
            return;
        }
        if (shiftCBox.getValue().trim().isEmpty()){
            productionGenerateValidateStatus.setText("Enter a shift");
            return;
        }

        String productCategory = productCategoryGPRTextField.getText();
        String shift = shiftCBox.getValue();

        GenerateProductionClass gp = new GenerateProductionClass(shift ,productCategory);
        productionGenerateValidateStatus.setText(gp.toString());
    }
}