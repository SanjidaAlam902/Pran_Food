package oop.iub.project.project1.marketingOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CollectFeedbackController
{
    @javafx.fxml.FXML
    private ComboBox<String> ratingCB;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField productNameTF;

    @javafx.fxml.FXML
    public void initialize() {
        ratingCB.getItems().addAll("1","2","3");
    }

    @Deprecated
    public void saveOA(ActionEvent actionEvent) {
        String productName= productNameTF.getText();

        if(ratingCB.getValue().equals("1")){
            outputLabel.setText("We are sorry the food did not meet expectations");
        }

        if(ratingCB.getValue().equals("2")){
            outputLabel.setText("We will work on improving flavour");
        }

        if(ratingCB.getValue().equals("3")){
            outputLabel.setText("We are glad thanks for your feedback");
        }



    }


    @javafx.fxml.FXML
    public void saveResponse(ActionEvent actionEvent) {
    }
}