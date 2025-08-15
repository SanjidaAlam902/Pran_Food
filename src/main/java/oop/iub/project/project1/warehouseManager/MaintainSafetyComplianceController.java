package oop.iub.project.project1.warehouseManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class MaintainSafetyComplianceController
{
    @FXML
    private ToggleGroup firstAidToggleGroup;
    @FXML
    private ToggleGroup fireExitinguisherToggleGroup;
    @FXML
    private TextField nameTF;
    @FXML
    private RadioButton fireNoRB;

    @FXML
    private RadioButton firstYesRB;
    @FXML
    private DatePicker datePicker;
    @FXML
    private RadioButton firstNoRB;
    @FXML
    private RadioButton emergencyNoRB;
    @FXML
    private RadioButton fireYesRB;
    @FXML
    private Label outputLabel;
    @FXML
    private ToggleGroup emergencyExitsToggleGroup;
    @FXML
    private RadioButton emergencyYesRB;

    @FXML
    public void initialize() {
    }

    @FXML
    public void submitOA(ActionEvent actionEvent) {
        String name = nameTF.getText();
        LocalDate inspectionDate = datePicker.getValue();


        String emergencyExitsUnblocked;
        if (emergencyYesRB.isSelected()){
            emergencyExitsUnblocked="Yes";
        } else if (emergencyNoRB.isSelected()){
            emergencyExitsUnblocked="No";

        } else {
            outputLabel.setText("please select a option");
            return;
        }

        String firstAidKitsStocked;
        if (fireYesRB.isSelected()){
            firstAidKitsStocked="Yes";
        } else if (firstNoRB.isSelected()){
            firstAidKitsStocked="No";

        } else {
            outputLabel.setText("please select a option");
            return;
        }

        String fireExtinguishersFunctional;
        if (fireYesRB.isSelected()){
            fireExtinguishersFunctional="Yes";
        } else if (fireNoRB.isSelected()){
            fireExtinguishersFunctional="No";

        } else {
            outputLabel.setText("please select a option");
            return;
        }





        maintainSafety mf=new maintainSafety(name,inspectionDate,emergencyExitsUnblocked,firstAidKitsStocked,fireExtinguishersFunctional );
        outputLabel.setText(mf.toString());




    }
}