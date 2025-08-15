package oop.iub.project.project1.marketingOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ExpandMarketReachcontroller
{
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private ComboBox<String> regionCB;
    @javafx.fxml.FXML
    private ComboBox<String> LocationCB;
    @javafx.fxml.FXML
    private ComboBox<String> languageCB;

    @javafx.fxml.FXML
    public void initialize() {
        regionCB.getItems().addAll("Dhaka","Khulna","California");
        LocationCB.getItems().addAll("Bangladesh","USA");
        languageCB.getItems().addAll("Bangla","English");

    }

    @javafx.fxml.FXML
    public void addInfoOA(ActionEvent actionEvent) {

        if(regionCB.getValue().equals("Dhaka") && LocationCB.getValue().equals("Bangladesh")){
            outputLabel.setText("Get 30% Discount on all items");
            return;
        }
        if(regionCB.getValue().equals("Khulna") && LocationCB.getValue().equals("Bangladesh")){
            outputLabel.setText("Get 30% Discount on all items");
            return;
        }

        if(regionCB.getValue().equals("California") && LocationCB.getValue().equals("USA")){
            outputLabel.setText("Get 40% Discount on all items");
            return;
        }




        String region = regionCB.getValue();
        String location = LocationCB.getValue();
        String language = languageCB.getValue();

        expandMarketReach expandMarketReach = new expandMarketReach(region , location , language);
        outputLabel.setText(expandMarketReach.toString());
    }
}