package com.example.poject_pranfood.SalesManager;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class SalesManagerCancelOrder
{
    @javafx.fxml.FXML
    private Label lblCancelMsg;
    @javafx.fxml.FXML
    private AnchorPane rootPane;
    @javafx.fxml.FXML
    private TableView tblOrdersCancel;
    @javafx.fxml.FXML
    private TableColumn colCustomer;
    @javafx.fxml.FXML
    private Button btnCancelOrder;
    @javafx.fxml.FXML
    private TableColumn colOrderId;
    @javafx.fxml.FXML
    private TableColumn colStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleCancelOrder(ActionEvent actionEvent) {
    }
}