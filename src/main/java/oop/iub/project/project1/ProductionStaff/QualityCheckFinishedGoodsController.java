package oop.iub.project.project1.ProductionStaff;

import oop.iub.project.project1.Suppliers.AlertCls;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;


public class QualityCheckFinishedGoodsController
{
    @javafx.fxml.FXML
    private ToggleGroup packagingSeal;
    @javafx.fxml.FXML
    private TextField batchidQCFGTextField;
    @javafx.fxml.FXML
    private ToggleGroup hygieneStatus;
    @javafx.fxml.FXML
    private TextField weightAccuracyQCFGTextField;
    @javafx.fxml.FXML
    private RadioButton passPackagingSealRadio;
    @javafx.fxml.FXML
    private RadioButton failPackagingSealRadio;
    @javafx.fxml.FXML
    private RadioButton failHygieneStatus;
    @javafx.fxml.FXML
    private ComboBox<String> labelingStatusQCFGComboBox;
    @javafx.fxml.FXML
    private TextArea qualityCheckFinishGoodsValidateLabel;
    @javafx.fxml.FXML
    private Label valiQCFGTextField;
    @javafx.fxml.FXML
    private RadioButton passHygieneStatus;

    @javafx.fxml.FXML
    public void initialize() {
        labelingStatusQCFGComboBox.getItems().addAll("Accept","Reject", "Missing");
    }

    @javafx.fxml.FXML
    public void submitQualityCheckFinishedGoodsOnClick(ActionEvent actionEvent) {
        String packagingSeal;
        if (passPackagingSealRadio.isSelected()){
            packagingSeal="Pass";
        }else if (failPackagingSealRadio.isSelected()) {
            packagingSeal = "Fail";
        }else{
            valiQCFGTextField.setText("Please select a  packaging seal status");
            return;
        }

        String hygieneStatus;
        if (passHygieneStatus.isSelected()){
            hygieneStatus="Pass";
        }else if (failHygieneStatus.isSelected()) {
            hygieneStatus = "Fail";
        }else{
            valiQCFGTextField.setText("Please select a hygiene status");
            return;

        }
        if (batchidQCFGTextField.getText().trim().isEmpty()){
            valiQCFGTextField.setText("Please enter batchId");
            return;
        }

        if (weightAccuracyQCFGTextField.getText().trim().isEmpty()) {
            valiQCFGTextField.setText("Please enter weight accuracy");
            return;

        }

        if (labelingStatusQCFGComboBox.getValue() == null) {
            valiQCFGTextField.setText("Please select one option");
            return;
        }

        int batchId =Integer.parseInt(batchidQCFGTextField.getText());
        float weightAccuracy =Float.parseFloat(weightAccuracyQCFGTextField.getText());
        String labelingStatus =labelingStatusQCFGComboBox.getValue();

        QualityGoodsCls qg = new QualityGoodsCls(batchId,weightAccuracy,labelingStatus,packagingSeal,hygieneStatus);
        qualityCheckFinishGoodsValidateLabel.setText(qg.toString());
    }
}