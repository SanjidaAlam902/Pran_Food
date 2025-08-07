package com.example.poject_pranfood.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CustomerFilterProducts
{
    @javafx.fxml.FXML
    private Button btnFilter;
    @javafx.fxml.FXML
    private TableColumn colName;
    @javafx.fxml.FXML
    private ComboBox comboCategory;
    @javafx.fxml.FXML
    private TableColumn colPrice;
    @javafx.fxml.FXML
    private TableColumn colCategory;
    @javafx.fxml.FXML
    private TextField txtMaxPrice;
    @javafx.fxml.FXML
    private Label lblError;
    @javafx.fxml.FXML
    private TableView tblFiltered;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleFilter(ActionEvent actionEvent) {
    }
}