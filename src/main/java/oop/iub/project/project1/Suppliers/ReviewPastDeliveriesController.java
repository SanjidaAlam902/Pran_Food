package oop.iub.project.project1.Suppliers;

import oop.iub.project.project1.ProductionStaff.AppendableObjectOutputStream;
import oop.iub.project.project1.ProductionStaff.ReceiveMaterialsCls;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReviewPastDeliveriesController
{
    @javafx.fxml.FXML
    private TableColumn<ReviewDeliveriesCls, String> statusRPDCol;
    @javafx.fxml.FXML
    private ToggleGroup reviewPastDelStatus;
    @javafx.fxml.FXML
    private TableView<ReviewDeliveriesCls> reviewPastDeliveriesTable;
    @javafx.fxml.FXML
    private ComboBox <String>reviewPastDelMaterialTypeComboBox;
    @javafx.fxml.FXML
    private RadioButton comRPDRadio;
    @javafx.fxml.FXML
    private RadioButton pendingRPDRadio;
    @javafx.fxml.FXML
    private TableColumn <ReviewDeliveriesCls, LocalDate>deliveryDateRPDCol;
    @javafx.fxml.FXML
    private RadioButton rejectedRPDRadio;
    @javafx.fxml.FXML
    private DatePicker pastDelStartDatepicker;
    @javafx.fxml.FXML
    private TableColumn <ReviewDeliveriesCls, String>materialTypeRPDCol;
    @javafx.fxml.FXML
    private TableColumn<ReviewDeliveriesCls, Integer> detailsRPDCol;
    @javafx.fxml.FXML
    private TextField reviewPastDelSupplierIdTF;
    @javafx.fxml.FXML
    private Label revPastDelValLab;

    @javafx.fxml.FXML
    public void initialize() throws IOException{
        reviewPastDelMaterialTypeComboBox.getItems().addAll("Raw Materials","Processed Ingredients","Packaging Materials");

        detailsRPDCol.setCellValueFactory(new PropertyValueFactory<>("supplierID"));
        materialTypeRPDCol.setCellValueFactory(new PropertyValueFactory<>("materialType"));
        statusRPDCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        deliveryDateRPDCol.setCellValueFactory(new PropertyValueFactory<>("deliverydate"));

        File file = new File("reviewDeliveries.bin");

        if (!file.exists()){
            return;
        }
        FileInputStream fis= new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            while (true){
                ReviewDeliveriesCls reviewDeliveries =(ReviewDeliveriesCls) ois.readObject();
                reviewDel.add(reviewDeliveries);
            }
        } catch (EOFException eof) {
            System.out.println("End of file reached");
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class not Found!");
        }

        reviewPastDeliveriesTable.getItems().addAll(reviewDel);
    }
    ArrayList<ReviewDeliveriesCls>reviewDel = new ArrayList<>();

    @javafx.fxml.FXML
    public void searchRPDOnClick(ActionEvent actionEvent) throws IOException {
        if (reviewPastDelSupplierIdTF.getText().trim().isEmpty()) {
            revPastDelValLab.setText("Please enter supplierID");
            return;
        }
        if (reviewPastDelMaterialTypeComboBox.getValue() == null) {
            revPastDelValLab.setText("Please select an Option.");
            return;
        }
        if (pastDelStartDatepicker.getValue() == null) {
            revPastDelValLab.setText("Please select an Option.");
            return;
        }
        int supplierID =Integer.parseInt(reviewPastDelSupplierIdTF.getText());
        String materialType = reviewPastDelMaterialTypeComboBox.getValue();
        LocalDate deliverydate = pastDelStartDatepicker.getValue();

        String status;
        if (comRPDRadio.isSelected()){
            status="Completed";
        }else if (pendingRPDRadio.isSelected()) {
            status = "Pending";
        }else if (rejectedRPDRadio.isSelected()) {
            status = "Rejected";
        }else{
            revPastDelValLab.setText("Please select an Urgency Level");
            return;
        }
        ReviewDeliveriesCls rpd = new ReviewDeliveriesCls(supplierID,materialType,status,deliverydate);

        File file = new File("reviewDeliveries.bin");
        FileOutputStream fis;
        ObjectOutputStream oos;

        if (file.exists()){
            fis = new FileOutputStream(file, true);
            oos = new AppendableObjectOutputStream(fis);
        }else {
            fis = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fis);
        }

        oos.writeObject(rpd);
        oos.close();

        reviewDel.add(rpd);
        revPastDelValLab.setText("Past Deliveries.");
        reviewPastDeliveriesTable.getItems().clear();
        reviewPastDeliveriesTable.getItems().addAll(reviewDel);

    }
}