package com.example.poject_pranfood.SalesManager;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class SalesManagerMonitorCustomerFeedback
{
    @javafx.fxml.FXML
    private TableColumn colCustomerName;
    @javafx.fxml.FXML
    private AnchorPane rootPane;
    @javafx.fxml.FXML
    private Button btnLoadFeedback;
    @javafx.fxml.FXML
    private TableColumn colFeedbackText;
    @javafx.fxml.FXML
    private TableView tblFeedback;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleLoadFeedback(ActionEvent actionEvent) {
    }
}