package oop.iub.project.project1.warehouseManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ShipmentListController
{
    @javafx.fxml.FXML
    private TableView<shipmentList> shipmentListTV;
    @javafx.fxml.FXML
    private TableColumn<shipmentList, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TextField shipmentOrderNumberTA;
    @javafx.fxml.FXML
    private TextField shipmentNameTA;
    @javafx.fxml.FXML
    private TableColumn<shipmentList,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<shipmentList,String> destinationCol;
    @javafx.fxml.FXML
    private TableColumn<shipmentList,Double> orderNumberCol;
    @javafx.fxml.FXML
    private TextField destinationTA;
    @javafx.fxml.FXML
    private DatePicker datePIcker;
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize()throws IOException {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("shipmentName"));
        orderNumberCol.setCellValueFactory(new PropertyValueFactory<>("shippingOrderNumber"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("shippingDate"));
        destinationCol.setCellValueFactory(new PropertyValueFactory<>("destination"));


        File file = new File("shipmentList.bin");

        if(!file.exists()){
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try{
            while (true){
                shipmentList shipmentList=(shipmentList) ois.readObject();
                shipmentListArrayList.add(shipmentList);
            }
        } catch (EOFException eof){
            System.out.println("End of file reached");
        } catch (ClassNotFoundException eof){
            System.out.println("Class not found");
        }

        shipmentListTV.getItems().addAll(shipmentListArrayList);


    }
    ArrayList<shipmentList>shipmentListArrayList=new ArrayList<>();

    @javafx.fxml.FXML
    public void addShipmentOA(ActionEvent actionEvent) throws IOException {
        if (shipmentNameTA.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Name");
            return;
        }

        if (shipmentOrderNumberTA.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Name");
            return;
        }

        if (datePIcker.getValue()==null) {
            outputLabel.setText("Enter Proper Name");
            return;
        }
        if (destinationTA.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Name");
            return;
        }

        shipmentList sl=new shipmentList(
            shipmentNameTA.getText(),
            Double.parseDouble(shipmentOrderNumberTA.getText()),
            datePIcker.getValue(),
            destinationTA.getText());

        File file = new File("shipmentList.bin");
        FileOutputStream fis;
        ObjectOutputStream oos;


        if(file.exists()){
            fis = new FileOutputStream(file,true);
            oos = new AppendableObjectOutput(fis);
        } else{
            fis = new FileOutputStream(file,true);
            oos=new ObjectOutputStream(fis);
        }
        oos.writeObject(sl);
        oos.close();


        shipmentListArrayList.add(sl);
        shipmentListTV.getItems().clear();
        shipmentListTV.getItems().addAll(shipmentListArrayList);
        outputLabel.setText("Data Added Successfully");

    }
}