package com.example.oopproject.Suppliers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class ViewPaymentHistoryController
{
    @javafx.fxml.FXML
    private Label validateLabelPaymentHistory;
    @javafx.fxml.FXML
    private TextField amountPaymentTextField;
    @javafx.fxml.FXML
    private TableColumn<PaymentCls, Float> amountCol;
    @javafx.fxml.FXML
    private ComboBox<String> paymentStatusComboBox;
    @javafx.fxml.FXML
    private TableView <PaymentCls>paymentHistoryTable;
    @javafx.fxml.FXML
    private TableColumn <PaymentCls, String>paymentStatusCol;
    @javafx.fxml.FXML
    private TextField paymentIdTextField;
    @javafx.fxml.FXML
    private TableColumn<PaymentCls, Integer> paymentIdCol;

    @javafx.fxml.FXML
    public void initialize() {
        paymentStatusComboBox.getItems().addAll("Completed", "Pending", "Failed");

        paymentStatusCol.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
        paymentIdCol.setCellValueFactory(new PropertyValueFactory<>("paymentID"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
    }
    ArrayList<PaymentCls> paymentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void submitPaymentHistoryOnClick(ActionEvent actionEvent) {
        if (paymentIdTextField.getText().trim().isEmpty()) {
            validateLabelPaymentHistory.setText("Please enter paymentID");
            return;
        }
        if (amountPaymentTextField.getText().trim().isEmpty()) {
            validateLabelPaymentHistory.setText("Please enter amount");
            return;
        }
        if (paymentStatusComboBox.getValue() == null) {
            validateLabelPaymentHistory.setText("Please select an Option.");
            return;
        }
        String paymentStatus =paymentStatusComboBox.getValue();
        int paymentID =Integer.parseInt(paymentIdTextField.getText());
        Float amount =Float.parseFloat(amountPaymentTextField.getText());

        PaymentCls phc = new PaymentCls(paymentStatus, paymentID,amount);
        paymentList.add(phc);
        validateLabelPaymentHistory.setText(" Submitted.");
        paymentHistoryTable.getItems().clear();
        paymentHistoryTable.getItems().addAll(paymentList);
    }
}