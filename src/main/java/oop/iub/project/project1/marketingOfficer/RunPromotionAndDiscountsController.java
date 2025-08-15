package oop.iub.project.project1.marketingOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RunPromotionAndDiscountsController {
    @javafx.fxml.FXML
    private TextField discountCodeTF;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField productNameTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {

        String productName = productNameTF.getText();
        String discount = discountCodeTF.getText();

        if(discountCodeTF.getText().equals(discount)) {
            outputLabel.setText("Discount Apply");
            return;
        }
        outputLabel.setText("Discount does not Apply");
    }
}