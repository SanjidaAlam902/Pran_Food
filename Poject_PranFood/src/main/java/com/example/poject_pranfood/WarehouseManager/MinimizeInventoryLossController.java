package com.example.poject_pranfood.WarehouseManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MinimizeInventoryLossController
{
    @javafx.fxml.FXML
    private TextField itemNameTF;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private ComboBox reasonForLossCB;
    @javafx.fxml.FXML
    private TextField QuantityTF;
    @javafx.fxml.FXML
    private DatePicker datePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void inventoryLossOA(ActionEvent actionEvent) {
    }
}