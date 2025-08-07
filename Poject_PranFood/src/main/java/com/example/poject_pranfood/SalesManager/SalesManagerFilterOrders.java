package com.example.poject_pranfood.SalesManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SalesManagerFilterOrders
{
    @javafx.fxml.FXML
    private TableColumn colTotalItems;
    @javafx.fxml.FXML
    private Button btnFilterOrders;
    @javafx.fxml.FXML
    private ComboBox comboStatus;
    @javafx.fxml.FXML
    private TableView tblFilteredOrders;
    @javafx.fxml.FXML
    private Label lblError;
    @javafx.fxml.FXML
    private TableColumn colCustomer;
    @javafx.fxml.FXML
    private TableColumn colOrderId;
    @javafx.fxml.FXML
    private DatePicker dateFilter;
    @javafx.fxml.FXML
    private TableColumn colStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleFilterOrders(ActionEvent actionEvent) {
    }
}