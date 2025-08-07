package com.example.poject_pranfood.JobSeekers;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MyApplicationView
{
    @javafx.fxml.FXML
    private TableView MyApplicationTableView;
    @javafx.fxml.FXML
    private TableColumn MyApplicationShiftTableColumn;
    @javafx.fxml.FXML
    private TableColumn MyApplicationLocationTableColumn;
    @javafx.fxml.FXML
    private TableColumn MyApplicationPostTableColumn;
    @javafx.fxml.FXML
    private TableColumn MyApplicationStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn MyApplicationSalaryTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void OnClickLoadMyApplication(ActionEvent actionEvent) {
    }
}