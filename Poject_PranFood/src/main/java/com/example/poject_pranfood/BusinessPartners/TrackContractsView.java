package com.example.poject_pranfood.BusinessPartners;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.List;

public class TrackContractsView
{
    @FXML private TableView<Contract> TrackMyContractsTableView;
    @FXML private TableColumn<Contract, String> TrackMyContractsIDTableColumn;
    @FXML private TableColumn<Contract, String> TrackMyContractsTitleTableColumn;
    @FXML private TableColumn<Contract, String> TrackMyContractsStatusTableColumn;
    @FXML private TableColumn<Contract, LocalDate> TrackMyContractsStartDateTableColumn;
    @FXML private TableColumn<Contract, LocalDate> TrackMyContractsEndDateTableColumn;

    // Dummy contracts data
    private final List<Contract> contracts = List.of(
            new Contract("C001", "Packaging Supply", "Active", LocalDate.of(2025, 1, 1), LocalDate.of(2025, 6, 30)),
            new Contract("C002", "Logistics Support", "Pending", LocalDate.of(2025, 2, 15), LocalDate.of(2025, 8, 15)),
            new Contract("C003", "IT Support", "Completed", LocalDate.of(2024, 8, 1), LocalDate.of(2024, 12, 31))
    );

    @FXML
    public void initialize() {
        TrackMyContractsIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        TrackMyContractsTitleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        TrackMyContractsStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        TrackMyContractsStartDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        TrackMyContractsEndDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
    }

    @FXML
    public void OnClickLoadMyContracts(ActionEvent actionEvent) {
        if (contracts.isEmpty()) {
            showAlert("No contracts found.");
        } else {
            TrackMyContractsTableView.setItems(FXCollections.observableArrayList(contracts));
        }
    }
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Contracts Info");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}