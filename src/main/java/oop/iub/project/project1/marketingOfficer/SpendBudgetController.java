package oop.iub.project.project1.marketingOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SpendBudgetController
{
    @javafx.fxml.FXML
    private ComboBox<String> platformsCB;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField totalBudgetTF;
    @javafx.fxml.FXML
    private TextField currentBudgetTF;

    @javafx.fxml.FXML
    public void initialize() {
        platformsCB.getItems().addAll("Google","Facebook","Influencer marketing ","Marketing Events");
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
    }
}


