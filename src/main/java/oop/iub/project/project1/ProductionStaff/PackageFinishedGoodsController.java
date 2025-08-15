package com.example.oopproject.ProductionStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PackageFinishedGoodsController
{
    @javafx.fxml.FXML
    private TextField packagingLineIDFGPTextField;
    @javafx.fxml.FXML
    private TextArea packagingStatusValidateLabel;
    @javafx.fxml.FXML
    private TextField quantityFGPTextField;
    @javafx.fxml.FXML
    private TextField productTypeFGPTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void processingPackagingOnClick(ActionEvent actionEvent) {
        if (packagingLineIDFGPTextField.getText().trim().isEmpty()){
            packagingStatusValidateLabel.setText("Please enter Packaging Line ID");
            return;
        }

        if (productTypeFGPTextField.getText().trim().isEmpty()){
            packagingStatusValidateLabel.setText("Please enter Product Type");
            return;
        }

        if (quantityFGPTextField.getText().trim().isEmpty()){
            packagingStatusValidateLabel.setText("Please enter Quantity of Packaging");
            return;
        }
        String productType = productTypeFGPTextField.getText();
        int quantity =Integer.parseInt(quantityFGPTextField.getText());
        int packagingLineId =Integer.parseInt(packagingLineIDFGPTextField.getText());

        PackageGoods pg = new PackageGoods(productType, quantity, packagingLineId);
        packagingStatusValidateLabel.setText(pg.toString());

    }
}