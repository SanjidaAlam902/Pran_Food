package oop.iub.project.project1.marketingOfficer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class LaunchNewProductsController
{
    @javafx.fxml.FXML
    private TextField productNameTF;
    @javafx.fxml.FXML
    private Label launchingDateLabel;
    @javafx.fxml.FXML
    private ComboBox<String> catagoryComboBox;
    @javafx.fxml.FXML
    private Label descriptionLabel;
    @javafx.fxml.FXML
    private TableColumn<LaunchNewProducts, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<LaunchNewProducts,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<LaunchNewProducts,String> CodeCol;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableColumn<LaunchNewProducts,String> CatagoryCol;
    @javafx.fxml.FXML
    private TextField productCodeTF;
    @javafx.fxml.FXML
    private TableView<LaunchNewProducts> ProductsTC;
    @javafx.fxml.FXML
    private Label outputlabel;

    ArrayList<LaunchNewProducts>productsArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {


        nameCol.setCellValueFactory(new PropertyValueFactory<>("productName"));
        CatagoryCol.setCellValueFactory(new PropertyValueFactory<>("catagory"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("launchingDate"));
        CodeCol.setCellValueFactory(new PropertyValueFactory<>("productCode"));

        catagoryComboBox.getItems().addAll("Frozen Food","Snack","Drink");
    }


    @javafx.fxml.FXML
    public void addProductsOA(ActionEvent actionEvent) {
        
        if (productNameTF.getText().trim().isEmpty()){
            outputlabel.setText("Enter Proper Name");
            return;

        }

        if (catagoryComboBox.getValue().trim().isEmpty()){
            outputlabel.setText("Enter Proper Catagory");
            return;

        }
        if (datePicker.getValue()==null){
            outputlabel.setText("Enter a Date");
            return;

        }
        if (productCodeTF.getText().trim().isEmpty()){
            outputlabel.setText("Enter Proper Code");
            return;

        }

        LaunchNewProducts launchNewProducts = new LaunchNewProducts(
        productNameTF.getText(),
        catagoryComboBox.getValue(),
        datePicker.getValue(),
        productCodeTF.getText());

        productsArrayList.add(launchNewProducts);
        ProductsTC.getItems().clear();
        ProductsTC.getItems().addAll(launchNewProducts);
    }



}


