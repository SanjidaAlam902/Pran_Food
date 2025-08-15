package oop.iub.project.project1.Suppliers;

import oop.iub.project.project1.ProductionStaff.ProductionLog;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ReviewQualityFeedbackController
{
    @javafx.fxml.FXML
    private TextField qualityScoreQFRTextField;
    @javafx.fxml.FXML
    private ComboBox<String> materialTypeQFRComboBox;
    @javafx.fxml.FXML
    private TextField deliveryIdQFRTextField;
    @javafx.fxml.FXML
    private TextArea remarksQFRTextArea;
    @javafx.fxml.FXML
    private TextArea feedbackStatusTArea;

    @javafx.fxml.FXML
    public void initialize() {
        materialTypeQFRComboBox.getItems().addAll("Fresh","Average", "Defect");
    }

    @javafx.fxml.FXML
    public void saveQualityFeedbackReviewOnClick(ActionEvent actionEvent) {
        if (deliveryIdQFRTextField.getText().trim().isEmpty()){
            remarksQFRTextArea.setText("Please enter Delivery ID");
            return;
        }
        if (materialTypeQFRComboBox.getValue() == null) {
            remarksQFRTextArea.setText("Please select an Option.");
            return;
        }
        if (qualityScoreQFRTextField.getText().trim().isEmpty()){
            remarksQFRTextArea.setText("Please enter Quantity");
            return;
        }
        int deliveryID =Integer.parseInt(deliveryIdQFRTextField.getText());
        Float qualityScore =Float.parseFloat(qualityScoreQFRTextField.getText());
        String materialType =materialTypeQFRComboBox.getValue();

        ReviewQualityFeedbackCls rq = new ReviewQualityFeedbackCls(qualityScore,materialType,deliveryID);
        feedbackStatusTArea.setText(rq.toString());

    }
}