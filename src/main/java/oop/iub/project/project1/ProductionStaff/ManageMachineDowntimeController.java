package oop.iub.project.project1.ProductionStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ManageMachineDowntimeController
{
    @javafx.fxml.FXML
    private TextField technicianTextField;
    @javafx.fxml.FXML
    private TextField machineIdMachineDownManTextField;
    @javafx.fxml.FXML
    private ComboBox <String>downtimeReasonComboBox;
    @javafx.fxml.FXML
    private DatePicker startTimeMachineDMDatePicker;
    @javafx.fxml.FXML
    private DatePicker endTimeMachineDMDatePicker;
    @javafx.fxml.FXML
    private TextArea machineDowntimestatusLabel;
    @javafx.fxml.FXML
    private Label machineDowntimeValidateLabel;

    @javafx.fxml.FXML
    public void initialize() {
        downtimeReasonComboBox.getItems().addAll("Mechanical Failure","Lack of Maintenance", "Operator Error", "Power Outage", "Raw Material Jam", "Cleaning & Sanitation");

    }

    @javafx.fxml.FXML
    public void submitMachineDowntimeOnClick(ActionEvent actionEvent) {
        if (technicianTextField.getText().trim().isEmpty()){
            machineDowntimeValidateLabel.setText("Please enter Technician Info");
            return;
        }

        if (machineIdMachineDownManTextField.getText().trim().isEmpty()) {
            machineDowntimeValidateLabel.setText("Please enter Machine ID");
            return;
        }

        if (startTimeMachineDMDatePicker.getValue() == null) {
            machineDowntimeValidateLabel.setText("Please select a Start Time Date");
            return;
        }

        if (endTimeMachineDMDatePicker.getValue() == null) {
            machineDowntimeValidateLabel.setText("Please select a End Time Date");
            return;

        }

        if (downtimeReasonComboBox.getValue() == null) {
            machineDowntimeValidateLabel.setText("Please select a Start Time Date");
            return;
        }

        String downtimeReason = downtimeReasonComboBox.getValue();
        String technician = technicianTextField.getText();
        LocalDate startTime = startTimeMachineDMDatePicker.getValue();
        LocalDate endTime = endTimeMachineDMDatePicker.getValue();
        int machineId =Integer.parseInt(machineIdMachineDownManTextField.getText());


        MachineDowntimeCls mdt = new MachineDowntimeCls(machineId, startTime, endTime, technician, downtimeReason);
        machineDowntimestatusLabel.setText(mdt.toString());
    }
}