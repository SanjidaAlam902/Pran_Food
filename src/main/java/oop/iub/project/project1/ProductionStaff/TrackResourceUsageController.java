package com.example.oopproject.ProductionStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrackResourceUsageController
{
    @javafx.fxml.FXML
    private TableColumn <trackResource,Integer>batchIdRUTCol;
    @javafx.fxml.FXML
    private DatePicker timePeriodRUTDatePicker;
    @javafx.fxml.FXML
    private TableColumn <trackResource, LocalDate>timePeriodRUTCol;
    @javafx.fxml.FXML
    private TableColumn <trackResource,String>resourceTypeRUTCol;
    @javafx.fxml.FXML
    private Label displayRUTValidateStatusLabel;
    @javafx.fxml.FXML
    private TextField batchIdRUTtextfield;
    @javafx.fxml.FXML
    private TableView<trackResource> resourceUsageTrackingTable;
    @javafx.fxml.FXML
    private ComboBox <String>resourceTypeTrackingComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        resourceTypeRUTCol.setCellValueFactory(new PropertyValueFactory<>("resourceType"));
        batchIdRUTCol.setCellValueFactory(new PropertyValueFactory<>("batchID"));
        timePeriodRUTCol.setCellValueFactory(new PropertyValueFactory<>("timePeriod"));

        resourceTypeTrackingComboBox.getItems().addAll("Energy","Water", "Materials");

    }
    ArrayList<trackResource>trackList = new ArrayList<>();

    @javafx.fxml.FXML
    public void exportDataRUTOnClick(ActionEvent actionEvent) {
        if (batchIdRUTtextfield.getText().trim().isEmpty()) {
            displayRUTValidateStatusLabel.setText("Please enter batchID");
            return;
        }
        if (timePeriodRUTDatePicker.getValue() == null) {
            displayRUTValidateStatusLabel.setText("Please select a Time Period.");
            return;

        }
        if (resourceTypeTrackingComboBox.getValue() == null) {
            displayRUTValidateStatusLabel.setText(("Please select resource type."));
            return;
        }

        String resourceType= resourceTypeTrackingComboBox.getValue();
        int batchID= Integer.parseInt(batchIdRUTtextfield.getText());
        LocalDate timePeriod= timePeriodRUTDatePicker.getValue();


        trackResource tr = new trackResource(resourceType,batchID, timePeriod);

        trackList.add(tr);
        resourceUsageTrackingTable.getItems().clear();
        displayRUTValidateStatusLabel.setText("Track Request Submit");
        resourceUsageTrackingTable.getItems().addAll((trackList));

    }
}