package oop.iub.project.project1.warehouseManager;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class AssignTasksToWarehouseStaffController {
    @javafx.fxml.FXML
    private TableColumn<AssignTask, String> locationCol;
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TextField staffNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> taskNameCB;
    @javafx.fxml.FXML
    private TableColumn<AssignTask, String> TaskNameCol;
    @javafx.fxml.FXML
    private TableColumn<AssignTask, LocalDate> deadlineCol;
    @javafx.fxml.FXML
    private TableView<AssignTask> assignTableView;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableColumn<AssignTask, String> staffNameCol;
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
        staffNameCol.setCellValueFactory(new PropertyValueFactory<>("staffName"));
        TaskNameCol.setCellValueFactory(new PropertyValueFactory<>("taskName"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("Location"));
        deadlineCol.setCellValueFactory(new PropertyValueFactory<>("deadline"));

        taskNameCB.getItems().addAll("Inventory Count", "Shelf Restocking", "Order Picking", "Packaging Orders", "Cleaning & Safety Inspection");
    }

    ArrayList<AssignTask> assignTaskArrayList = new ArrayList<>();

    @FXML
    public void assignStaffOA(ActionEvent actionEvent) {


        if (staffNameTF.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Name");
            return;
        }

        if (taskNameCB.getValue().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Name");
            return;
        }
        if (locationTF.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Name");
            return;
        }
        if (datePicker.getValue() == null) {
            outputLabel.setText("Enter Proper Name");
            return;
        }

        AssignTask ass1 = new AssignTask(
                staffNameTF.getText(),
                taskNameCB.getValue(),
                locationTF.getText(),
                datePicker.getValue());

        assignTaskArrayList.add(ass1);
        assignTableView.getItems().clear();
        assignTableView.getItems().addAll(assignTaskArrayList);
        outputLabel.setText("Added Successfully");

    }

}

