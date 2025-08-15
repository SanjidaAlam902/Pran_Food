package oop.iub.project.project1.warehouseManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop.iub.project.project1.HelloApplication;

public class WareHouseManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateInventoryReportOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("warehouseManager/generateInventoryReport.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void shipmentListOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("warehouseManager/shipmentList.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void AssignTaskstoStaffOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("warehouseManager/assignTasksToWarehouseStaff.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goBackTOHomeOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("warehouseManager/wareHouseManagerDashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void StockLevelOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("warehouseManager/warnAboutLowStock.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void comparedExpiryDateOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("warehouseManager/comparedExpiryDate.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void maintainSafetyRecordsOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("warehouseManager/maintainSafetyCompliance.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void InventoryLossOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("warehouseManager/minimizeInventoryLoss.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void PackingListOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("warehouseManager/optimizePickingAndPackingProcess.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }
}