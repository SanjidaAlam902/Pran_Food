package oop.iub.project.project1.ProductionStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


import java.io.*;
import java.util.ArrayList;

public class ReceiveRawMaterialsController
{
    @javafx.fxml.FXML
    private TextField quantityRRMTextField;
    @javafx.fxml.FXML
    private TableColumn<ReceiveMaterialsCls, String> supplierRRMCol;
    @javafx.fxml.FXML
    private TableView <ReceiveMaterialsCls>receiveRawMaterialsTable;
    @javafx.fxml.FXML
    private TableColumn <ReceiveMaterialsCls, Integer>quantityRRMCol;
    @javafx.fxml.FXML
    private TextField materialTypeRRMTextField;
    @javafx.fxml.FXML
    private TableColumn <ReceiveMaterialsCls, String>materialTypeRRMCol;
    @javafx.fxml.FXML
    private TextField suppliernameRRMTextField;
    @javafx.fxml.FXML
    private Label valStatusLab;

    @javafx.fxml.FXML
    public void initialize() throws IOException{
        supplierRRMCol.setCellValueFactory(new PropertyValueFactory<>("supplierName"));
        materialTypeRRMCol.setCellValueFactory(new PropertyValueFactory<>("materialType"));
        quantityRRMCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        File file = new File("receiveMaterials.bin");

        if (!file.exists()){
            return;
        }
        FileInputStream fis= new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            while (true){
                ReceiveMaterialsCls receiveMaterials =(ReceiveMaterialsCls) ois.readObject();
                receivematerial.add(receiveMaterials);
            }
        } catch (EOFException eof) {
            System.out.println("End of file reached");
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class not Found!");
        }

        receiveRawMaterialsTable.getItems().addAll(receivematerial);


    }
    ArrayList<ReceiveMaterialsCls>receivematerial = new ArrayList<>();

    @javafx.fxml.FXML
    public void submitReceiveRawMaterialsOnClick(ActionEvent actionEvent) throws IOException {
        if (suppliernameRRMTextField.getText().trim().isEmpty()) {
            valStatusLab.setText("Please enter Supplier Name.");
            return;
        }
        if (materialTypeRRMTextField.getText().trim().isEmpty()) {
            valStatusLab.setText("Please enter Material Type");
            return;
        }
        if (quantityRRMTextField.getText().trim().isEmpty()) {
            valStatusLab.setText("Please enter BatchID");
            return;
        }
        String supplierName= suppliernameRRMTextField.getText();
        String materialType = materialTypeRRMTextField.getText();
        Float quantity =Float.parseFloat(quantityRRMTextField.getText());

        ReceiveMaterialsCls rm = new ReceiveMaterialsCls(supplierName,materialType,quantity);

        File file = new File("receiveMaterials.bin");
        FileOutputStream fis;
        ObjectOutputStream oos;

        if (file.exists()){
            fis = new FileOutputStream(file, true);
            oos = new AppendableObjectOutputStream(fis);
        }else {
            fis = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fis);
        }

        oos.writeObject(rm);
        oos.close();

        receivematerial.add(rm);
        valStatusLab.setText("Receive Materials info");
        receiveRawMaterialsTable.getItems().clear();
        receiveRawMaterialsTable.getItems().addAll(receivematerial);

    }
}