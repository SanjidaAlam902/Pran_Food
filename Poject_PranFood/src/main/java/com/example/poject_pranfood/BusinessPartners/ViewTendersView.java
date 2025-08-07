package com.example.poject_pranfood.BusinessPartners;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewTendersView
{
    @javafx.fxml.FXML
    private TableColumn AllAvailTenderCategoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn AllAvailTenderDeadlineTableColumn;
    @javafx.fxml.FXML
    private TableColumn AllAvailTenderStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn AllAvailTendersIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn FilterTenderTitleTableColumn;
    @javafx.fxml.FXML
    private TableColumn AllAvailTenderTitleTableColumn;
    @javafx.fxml.FXML
    private TableView FilterTendersTableView;
    @javafx.fxml.FXML
    private TableColumn FilterTenderDeadlineTableColumn;
    @javafx.fxml.FXML
    private DatePicker FilterDeadlineDatePicker;
    @javafx.fxml.FXML
    private ComboBox FilterCategoryComboBox;
    @javafx.fxml.FXML
    private TableColumn FilterTendersIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn FilterTenderStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn FilterTenderCategoryTableColumn;
    @javafx.fxml.FXML
    private TableView AvailTendersTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void OnClickLoadAllTenders(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OnClickFilterTenders(ActionEvent actionEvent) {
    }
}