package oop.iub.project.project1.warehouseManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class MinimizeInventoryLossController
{
    @javafx.fxml.FXML
    private TextField itemNameTF;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private ComboBox<String> reasonForLossCB;
    @javafx.fxml.FXML
    private TextField QuantityTF;
    @javafx.fxml.FXML
    private DatePicker datePicker;

    @javafx.fxml.FXML
    public void initialize() {
        reasonForLossCB.getItems().addAll("Broken","Stolen","Expired","Others");
    }

    @javafx.fxml.FXML
    public void inventoryLossOA(ActionEvent actionEvent) {
        if (itemNameTF.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Name");
            return;
        }

        if (QuantityTF.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Quantity");
            return;
        }

        if (datePicker.getValue()==null) {
            outputLabel.setText("Enter Proper Date");
            return;
        }

        if (reasonForLossCB.getValue().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Reason");
            return;
        }
        String itemName = itemNameTF.getText();
        Double quantity = Double.parseDouble(QuantityTF.getText());
        LocalDate dateOfLoss = datePicker.getValue();
        String reasonForLoss = reasonForLossCB.getValue();


        inventoryLoss iv = new inventoryLoss(itemName ,quantity ,dateOfLoss ,reasonForLoss);
        outputLabel.setText(iv.toString());


    }
}