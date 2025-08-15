package oop.iub.project.project1.Suppliers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class GetAlertsForDeliveryIssuesController
{
    @javafx.fxml.FXML
    private ComboBox <String>alertTypeDeliveryComboBox;
    @javafx.fxml.FXML
    private TextArea issuesDetailsStatusTArea;
    @javafx.fxml.FXML
    private TextField delIDAlertsTextField;
    @javafx.fxml.FXML
    private DatePicker deliveryIssuesDatepicker;
    @javafx.fxml.FXML
    private Label valStatusLab;
    @javafx.fxml.FXML
    private RadioButton solvedRbutton;
    @javafx.fxml.FXML
    private RadioButton unsolvedRbutton;
    @javafx.fxml.FXML
    private ToggleGroup statusbutton;

    @javafx.fxml.FXML
    public void initialize() {
        alertTypeDeliveryComboBox.getItems().addAll("Delivery Delay", "Quality Issue", "Missing Package", "Customer Complaint");
    }

    @javafx.fxml.FXML
    public void submitDeliveryIssuesOnClick(ActionEvent actionEvent) {
        if (deliveryIssuesDatepicker.getValue() == null) {
            valStatusLab.setText("Please select a Date.");
            return;
        }
        if (alertTypeDeliveryComboBox.getValue() == null) {
            valStatusLab.setText("Please select an Option.");
            return;
        }
        if (delIDAlertsTextField.getText().trim().isEmpty()) {
            valStatusLab.setText("Please enter Delivery ID");
            return;
        }

        LocalDate alertDate = deliveryIssuesDatepicker.getValue();
        int deliveryID =Integer.parseInt(delIDAlertsTextField.getText());
        String alertType =alertTypeDeliveryComboBox.getValue();

        String status;
        if (solvedRbutton.isSelected()){
            status="Solved";
        }else if (unsolvedRbutton.isSelected()) {
            status = "Unsolved";
        }else{
            valStatusLab.setText("Please select a status");
            return;
        }

        AlertCls ac = new AlertCls(status,alertType,deliveryID,alertDate);
        issuesDetailsStatusTArea.setText(ac.toString());
    }
}