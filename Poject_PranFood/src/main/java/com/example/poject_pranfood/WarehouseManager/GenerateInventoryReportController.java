package com.example.poject_pranfood.WarehouseManager;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GenerateInventoryReportController
{
    @javafx.fxml.FXML
    private TableColumn IDCol;
    @javafx.fxml.FXML
    private TextField itemNameTF;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TableColumn quantityCol;
    @javafx.fxml.FXML
    private TextField itemIDTF;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView inventoryTableView;
    @javafx.fxml.FXML
    private TextField quantityTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
    }
}