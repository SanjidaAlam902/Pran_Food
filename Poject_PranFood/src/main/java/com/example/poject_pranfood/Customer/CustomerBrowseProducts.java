package com.example.poject_pranfood.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class CustomerBrowseProducts
{
    @javafx.fxml.FXML
    private Button btnLoadProducts;
    @javafx.fxml.FXML
    private TableView tblProducts;
    @javafx.fxml.FXML
    private TableColumn colName;
    @javafx.fxml.FXML
    private AnchorPane rootPane;
    @javafx.fxml.FXML
    private TableColumn colPrice;
    @javafx.fxml.FXML
    private TableColumn colCategory;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleLoadProducts(ActionEvent actionEvent) {
    }
}