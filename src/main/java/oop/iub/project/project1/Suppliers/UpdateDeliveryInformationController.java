package oop.iub.project.project1.Suppliers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class UpdateDeliveryInformationController
{
    @javafx.fxml.FXML
    private TextField vehicleNoTextField;
    @javafx.fxml.FXML
    private TableView<updateDeliveryInfoCls> updateDeliveriesTable;
    @javafx.fxml.FXML
    private RadioButton deliveredRadio;
    @javafx.fxml.FXML
    private Label updateStatusMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<updateDeliveryInfoCls,Integer> orderIdCol;
    @javafx.fxml.FXML
    private RadioButton inProgressRadio;
    @javafx.fxml.FXML
    private ToggleGroup GroupStatus;
    @javafx.fxml.FXML
    private TableColumn <updateDeliveryInfoCls,Integer>deliveryIDCol;
    @javafx.fxml.FXML
    private TableColumn <updateDeliveryInfoCls, Integer>driverCol;
    @javafx.fxml.FXML
    private TableColumn <updateDeliveryInfoCls, LocalDate>deliveryDateCol;
    @javafx.fxml.FXML
    private DatePicker deliveryTimeDP;
    @javafx.fxml.FXML
    private TextField driverContactTextField;
    @javafx.fxml.FXML
    private RadioButton pendingRadio;
    @javafx.fxml.FXML
    private TableColumn <updateDeliveryInfoCls, Integer>vehicleIdCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateSubmitButtonOnClick(ActionEvent actionEvent) {
    }
}