package oop.iub.project.project1.Suppliers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrackDeliveryStatusController
{
    @javafx.fxml.FXML
    private TableView<TrackDeliveryCls> statusHistoryTable;
    @javafx.fxml.FXML
    private TableColumn<TrackDeliveryCls, String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<TrackDeliveryCls, LocalDate> dateStatusCol;
    @javafx.fxml.FXML
    private TextField deliveryIdField;
    @javafx.fxml.FXML
    private TableColumn<TrackDeliveryCls,String> statusLocationCol;
    @javafx.fxml.FXML
    private DatePicker trackDelDatePicker;
    @javafx.fxml.FXML
    private TextField currentStatusTextField;
    @javafx.fxml.FXML
    private Label valStatusLabel;
    @javafx.fxml.FXML
    private TextField locationTField;
    @javafx.fxml.FXML
    private TableColumn<TrackDeliveryCls, Integer> deliveryIdCol;

    @javafx.fxml.FXML
    public void initialize() {
        deliveryIdCol.setCellValueFactory(new PropertyValueFactory<>("deliveryId"));
        statusLocationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        dateStatusCol.setCellValueFactory(new PropertyValueFactory<>("trackDate"));
    }

    ArrayList<TrackDeliveryCls> deliverystatus = new ArrayList<>();

    @javafx.fxml.FXML
    public void submitStatusOnClick(ActionEvent actionEvent) {
        if (deliveryIdField.getText().trim().isEmpty()) {
            valStatusLabel.setText("Please enter Delivery ID");
            return;
        }
        if (locationTField.getText().trim().isEmpty()) {
            valStatusLabel.setText("Please enter location");
            return;
        }
        if (currentStatusTextField.getText().trim().isEmpty()) {
            valStatusLabel.setText("Please enter current status");
            return;
        }
        if (trackDelDatePicker.getValue() == null) {
            valStatusLabel.setText("Please select Date");
            return;
        }
        int deliveryId =Integer.parseInt(deliveryIdField.getText());
        String location = locationTField.getText();
        String status =currentStatusTextField.getText();
        LocalDate trackDate = trackDelDatePicker.getValue();


        TrackDeliveryCls tdsc = new TrackDeliveryCls(deliveryId,location, status,trackDate);
        deliverystatus.add(tdsc);
        valStatusLabel.setText("Request Submitted.");
        statusHistoryTable.getItems().clear();
        statusHistoryTable.getItems().addAll(deliverystatus);
    }
}