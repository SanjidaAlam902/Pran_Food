package com.example.poject_pranfood.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CustomerPlaceOrder
{
    @javafx.fxml.FXML
    private TableColumn colName;
    @javafx.fxml.FXML
    private Button btnPlaceOrder;
    @javafx.fxml.FXML
    private TableView tblCartItems;
    @javafx.fxml.FXML
    private TableColumn colPrice;
    @javafx.fxml.FXML
    private Label lblStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handlePlaceOrder(ActionEvent actionEvent) {
    }
}