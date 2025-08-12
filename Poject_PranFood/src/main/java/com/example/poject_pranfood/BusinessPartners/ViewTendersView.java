package com.example.poject_pranfood.BusinessPartners;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ViewTendersView
{
    @FXML
    private TableColumn<Tender, String> AllAvailTenderCategoryTableColumn;

    @FXML
    private TableColumn<Tender, String> AllAvailTenderDeadlineTableColumn;

    @FXML
    private TableColumn<Tender, String> AllAvailTenderStatusTableColumn;

    @FXML
    private TableColumn<Tender, String> AllAvailTenderTitleTableColumn;

    @FXML
    private TableColumn<Tender, String> AllAvailTendersIDTableColumn;

    @FXML
    private TableView<Tender> AvailTendersTableView;

    @FXML
    private ComboBox<String> FilterCategoryComboBox;

    @FXML
    private DatePicker FilterDeadlineDatePicker;

    @FXML
    private TableColumn<Tender, String> FilterTenderCategoryTableColumn;

    @FXML
    private TableColumn<Tender, String> FilterTenderDeadlineTableColumn;

    @FXML
    private TableColumn<Tender, String> FilterTenderStatusTableColumn;

    @FXML
    private TableColumn<Tender, String> FilterTenderTitleTableColumn;

    @FXML
    private TableColumn<Tender, String> FilterTendersIDTableColumn;

    @FXML
    private TableView<Tender> FilterTendersTableView;

    private final List<Tender> tenders = List.of(
            new Tender("T001", "Packaging Supply", "Packaging", LocalDate.now().plusDays(10), "Open"),
            new Tender("T002", "Logistics Support", "Logistics", LocalDate.now().plusDays(5), "Open"),
            new Tender("T003", "Raw Materials", "Supplies", LocalDate.now().plusDays(15), "Closed"),
            new Tender("T004", "IT Support", "IT", LocalDate.now().plusDays(20), "Open")
    );

    @FXML
    public void initialize() {
        AllAvailTendersIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        AllAvailTenderTitleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        AllAvailTenderCategoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        AllAvailTenderDeadlineTableColumn.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        AllAvailTenderStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Setup columns for filtered tenders table
        FilterTendersIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        FilterTenderTitleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        FilterTenderCategoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        FilterTenderDeadlineTableColumn.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        FilterTenderStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Populate category filter dropdown
        FilterCategoryComboBox.setItems(FXCollections.observableArrayList("Packaging", "Logistics", "Supplies", "IT"));

    }

    @FXML
    public void OnClickLoadAllTenders(ActionEvent actionEvent) {
        AvailTendersTableView.setItems(FXCollections.observableArrayList(tenders));
    }

    @FXML
    public void OnClickFilterTenders(ActionEvent actionEvent) {
        String selectedCategory = FilterCategoryComboBox.getValue();
        LocalDate selectedDeadline = FilterDeadlineDatePicker.getValue();

        List<Tender> filtered = tenders.stream()
                .filter(t -> (selectedCategory == null || selectedCategory.isEmpty() || t.getCategory().equalsIgnoreCase(selectedCategory)))
                .filter(t -> (selectedDeadline == null || !t.getDeadline().isAfter(selectedDeadline)))
                .collect(Collectors.toList());

        FilterTendersTableView.setItems(FXCollections.observableArrayList(filtered));
    }
}