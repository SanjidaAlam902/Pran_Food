package com.example.poject_pranfood.WarehouseManager;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ShipmentListController
{
    @javafx.fxml.FXML
    private TableView shipmentListTV;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TextField shipmentOrderNumberTA;
    @javafx.fxml.FXML
    private TextField shipmentNameTA;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TableColumn destinationCol;
    @javafx.fxml.FXML
    private TableColumn orderNumberCol;
    @javafx.fxml.FXML
    private TextField destinationTA;
    @javafx.fxml.FXML
    private DatePicker datePIcker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addShipmentOA(ActionEvent actionEvent) {
    }
}