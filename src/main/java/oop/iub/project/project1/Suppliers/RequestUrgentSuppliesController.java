package com.example.oopproject.Suppliers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class RequestUrgentSuppliesController
{
    @javafx.fxml.FXML
    private Label validateLabelRUS;
    @javafx.fxml.FXML
    private TextField reasonRUSTextField;
    @javafx.fxml.FXML
    private RadioButton highRadio;
    @javafx.fxml.FXML
    private TableColumn<ReqSupplyCls, Integer> quantityRUSCol;
    @javafx.fxml.FXML
    private ToggleGroup requestUrgencyLevel;
    @javafx.fxml.FXML
    private TableColumn<ReqSupplyCls,String> materialTypeRUSCol;
    @javafx.fxml.FXML
    private TableColumn<ReqSupplyCls,String> reasonRUSCol;
    @javafx.fxml.FXML
    private TextField materialTypeRUSTextField;
    @javafx.fxml.FXML
    private TableColumn <ReqSupplyCls,String>urgencyLevelRUSCol;
    @javafx.fxml.FXML
    private RadioButton lowRadio;
    @javafx.fxml.FXML
    private TableView <ReqSupplyCls>requestUrgentSuppliesTable;
    @javafx.fxml.FXML
    private TextField quantityRUSTextField;
    @javafx.fxml.FXML
    private RadioButton mediumRadio;

    @javafx.fxml.FXML
    public void initialize() {
        materialTypeRUSCol.setCellValueFactory(new PropertyValueFactory<>("materialType"));
        reasonRUSCol.setCellValueFactory(new PropertyValueFactory<>("reason"));
        urgencyLevelRUSCol.setCellValueFactory(new PropertyValueFactory<>("urgencyLevel"));
        quantityRUSCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }
    ArrayList<ReqSupplyCls>supplyList = new ArrayList<>();

    @javafx.fxml.FXML
    public void submitRUrgentSOnClick(ActionEvent actionEvent) {
        if (materialTypeRUSTextField.getText().trim().isEmpty()) {
            validateLabelRUS.setText("Please enter Material Type");
            return;
        }
        if (reasonRUSTextField.getText().trim().isEmpty()) {
            validateLabelRUS.setText("Please enter reason.");
            return;
        }
        if (quantityRUSTextField.getText().trim().isEmpty()) {
            validateLabelRUS.setText("Please enter quantity");
            return;
        }
        String materialType = materialTypeRUSTextField.getText();
        String reason = reasonRUSTextField.getText();
        int quantity =Integer.parseInt(quantityRUSTextField.getText());

        String urgencyLevel;
        if (lowRadio.isSelected()){
            urgencyLevel="Low";
        }else if (mediumRadio.isSelected()) {
            urgencyLevel = "Medium";
        }else if (highRadio.isSelected()) {
            urgencyLevel = "High";
        }else{
            validateLabelRUS.setText("Please select an Urgency Level");
            return;
        }
        ReqSupplyCls rsc = new ReqSupplyCls(materialType,reason,urgencyLevel,quantity);
        supplyList.add(rsc);
        validateLabelRUS.setText("Request Submitted.");
        requestUrgentSuppliesTable.getItems().clear();
        requestUrgentSuppliesTable.getItems().addAll(supplyList);
    }

}