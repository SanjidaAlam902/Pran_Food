package oop.iub.project.project1.marketingOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MakeAdvertisementsController
{
    @javafx.fxml.FXML
    private TextField productsNameTA;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField productIDTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void advertisementOA(ActionEvent actionEvent) {
        if(productIDTF.getText().length()!=6) {
            outputLabel.setText("Fresh Juice –Pure fruit. Pure refreshment.Soft Drink:Fizz Up your Day");
        }

        if(productIDTF.getText().length()!=7){
            outputLabel.setText("Ice Cream :Scoop up the joy.");
        }

        if(productIDTF.getText().length()!=8){
            outputLabel.setText("Noodles: Slurp up the flavor");
        }
        else{
            outputLabel.setText("Enter Proper ID");
        }


        String productName = productsNameTA.getText();
        String productID = productIDTF.getText();

        makeAd makeAd = new makeAd (productName , productID) ;
        outputLabel.setText(makeAd.toString());











    }
}