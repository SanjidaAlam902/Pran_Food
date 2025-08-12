package com.example.poject_pranfood.BusinessPartners;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;

public class PaymentHistoryView
{
    @FXML
    private TableView<Payment> PaymentHistoryTableView;

    @FXML
    private TableColumn<Payment, String> PaymentInvoiceNoTableColumn;

    @FXML
    private TableColumn<Payment, Double> PaymentAmountTableColumn;

    @FXML
    private TableColumn<Payment, String> PaymentStatusTableColumn;

    @FXML
    private TableColumn<Payment, String> PaymentDeadlineTableColumn;

    // Initialize method called after FXML is loaded
    @FXML
    public void initialize() {
        PaymentInvoiceNoTableColumn.setCellValueFactory(new PropertyValueFactory<>("invoiceNo"));
        PaymentAmountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        PaymentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        PaymentDeadlineTableColumn.setCellValueFactory(new PropertyValueFactory<>("deadline"));
    }

    @FXML
    public void OnClickLoadAllPaymentHistory(ActionEvent actionEvent) {
        ObservableList<Payment> data = FXCollections.observableArrayList(
                new Payment("INV-001", 1500.0, "Paid", "2025-08-01"),
                new Payment("INV-002", 2300.5, "Pending", "2025-08-10"),
                new Payment("INV-003", 1250.75, "Overdue", "2025-07-25")
        );

        PaymentHistoryTableView.setItems(data);
    }
}