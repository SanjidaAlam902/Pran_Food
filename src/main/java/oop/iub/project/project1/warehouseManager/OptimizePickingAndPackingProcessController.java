package oop.iub.project.project1.warehouseManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OptimizePickingAndPackingProcessController
{
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TextField itemNameTF;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private ComboBox<String> pickedCB;
    @javafx.fxml.FXML
    private TextField itemCodeTF;

    @javafx.fxml.FXML
    public void initialize() {
        pickedCB.getItems().addAll("Yes","No");
    }

    @javafx.fxml.FXML
    public void saveInfoOA(ActionEvent actionEvent) {

        if(itemCodeTF.getText().length()!=6){
            outputLabel.setText("Item number must be 6!");
            return;
        }

        String itemCode = itemCodeTF.getText();
        String itemName = itemNameTF.getText();
        String location = locationTF.getText();
        String picked = pickedCB.getValue();


        pickingAndPacking pnp=new pickingAndPacking(itemCode ,itemName ,location , picked);
        outputLabel.setText(pnp.toString());
    }
}