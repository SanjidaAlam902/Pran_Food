package com.example.poject_pranfood.WarehouseManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class MaintainSafetyComplianceController
{
    @javafx.fxml.FXML
    private ToggleGroup firstAidToggleGroup;
    @javafx.fxml.FXML
    private ToggleGroup fireExitinguisherToggleGroup;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private RadioButton fireNoRB;

    @javafx.fxml.FXML
    private RadioButton firstYesRB;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private RadioButton firstNoRB;
    @javafx.fxml.FXML
    private RadioButton emergencyNoRB;
    @javafx.fxml.FXML
    private RadioButton fireYesRB;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private ToggleGroup emergencyExitsToggleGroup;
    @javafx.fxml.FXML
    private RadioButton emergencyYesRB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitOA(ActionEvent actionEvent) {
    }
}