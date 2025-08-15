package oop.iub.project.project1.warehouseManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class GenerateInventoryReportController {
    @javafx.fxml.FXML
    private TableColumn<generateInventoryReport, String> IDCol;
    @javafx.fxml.FXML
    private TextField itemNameTF;
    @javafx.fxml.FXML
    private TableColumn<generateInventoryReport, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<generateInventoryReport, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<generateInventoryReport, Double> quantityCol;
    @javafx.fxml.FXML
    private TextField itemIDTF;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView<generateInventoryReport> inventoryTableView;
    @javafx.fxml.FXML
    private TextField quantityTF;
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() throws IOException {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        IDCol.setCellValueFactory(new PropertyValueFactory<>("itemID"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        File file = new File("inventoryReport.bin");

        if(!file.exists()){
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try{
            while (true){
                generateInventoryReport generateInventoryReport=(generateInventoryReport) ois.readObject();
                     inventoryReportArrayList.add(generateInventoryReport);
            }
        } catch (EOFException eof){
            System.out.println("End of the reached");
        }catch (ClassNotFoundException cnf){
            System.out.println("Class not found");
        }
        inventoryTableView.getItems().addAll(inventoryReportArrayList);
    }

    ArrayList<generateInventoryReport> inventoryReportArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) throws IOException {
        if (itemNameTF.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Name");
            return;

        }
        if (itemIDTF.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper ID");
            return;

        }

        if (quantityTF.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Quantity");
            return;

        }
        if (datePicker.getValue() == null) {
            outputLabel.setText("Set Date");
            return;

        }


        generateInventoryReport inventoryReport = new generateInventoryReport(
                itemNameTF.getText(),
                itemIDTF.getText(),
                Double.parseDouble(quantityTF.getText()),
                datePicker.getValue());

        File file = new File("inventoryReport.bin");
        FileOutputStream fis;
        ObjectOutputStream oos;


        if(file.exists()){
            fis = new FileOutputStream(file,true);
            oos = new AppendableObjectOutput(fis);
        } else{
            fis = new FileOutputStream(file,true);
            oos=new ObjectOutputStream(fis);
        }

        oos.writeObject(inventoryReport);
        oos.close();


        inventoryReportArrayList.add(inventoryReport);
        inventoryTableView.getItems().clear();
        inventoryTableView.getItems().addAll(inventoryReportArrayList);
        outputLabel.setText("Data Enter Successfull");



    }
}
