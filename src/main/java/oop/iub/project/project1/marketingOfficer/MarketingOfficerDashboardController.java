package oop.iub.project.project1.marketingOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop.iub.project.project1.HelloApplication;

public class MarketingOfficerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void newTrainingMaterialOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("marketingOfficer/trainSalesTeam.fxml"));
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
    public void marketingBudgetOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("marketingOfficer/spendBudget.fxml"));
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
    public void GoBacktoHome(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("marketingOfficer/marketingOfficerDashboard.fxml"));
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
    public void newProductOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("marketingOfficer/launchNewProducts.fxml"));
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
    public void discountOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("marketingOfficer/runPromotionAndDiscounts.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Hello");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void CreateAdOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("marketingOfficer/makeAdvertisements.fxml"));
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
    public void promoteJobsOpportunitiesOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("marketingOfficer/promoteJobsOpportunities.fxml"));
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
    public void MarketAvailabilityOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("marketingOfficer/expandMarketReach.fxml"));
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
    public void CreateFeedbackOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("marketingOfficer/collectFeedback.fxml"));
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