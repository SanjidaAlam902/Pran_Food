package com.example.poject_pranfood.BusinessPartners;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BusinessPartnersDashboardView {

    /**
     * Helper method to load and display a new scene from the given FXML file.
     */
    private void loadScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/project_pranfood/" + fxmlFile));
            Stage stage = new Stage();
            stage.setTitle(fxmlFile.replace(".fxml", ""));
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void OnClickDownloadReports(ActionEvent event) {
        loadScene("DownloadReportView.fxml");
    }

    @FXML
    void OnClickLogOutNavigate(ActionEvent event) {
        loadScene("LogIn.fxml");
    }

    @FXML
    void OnClickNegotiateTerms(ActionEvent event) {
        loadScene("NegotiateTermsView.fxml");
    }

    @FXML
    void OnClickSignInNavigate(ActionEvent event) {
        loadScene("LogIn.fxml");
    }

    @FXML
    void OnClickSubmitProposal(ActionEvent event) {
        loadScene("SubmitProposalView.fxml");
    }

    @FXML
    void OnClickSubmitSamples(ActionEvent event) {
        loadScene("SampleSubmitView.fxml");
    }

    @FXML
    void OnClickTenderNotificationPreferences(ActionEvent event) {
        loadScene("TenderNotificationPreferencesView.fxml");
    }

    @FXML
    void OnClickTrackContracts(ActionEvent event) {
        loadScene("TrackContractsView.fxml");
    }

    @FXML
    void OnClickViewPayments(ActionEvent event) {
        loadScene("PaymentHistoryView.fxml");
    }

    @FXML
    void OnClickViewTenders(ActionEvent event) {
        loadScene("ViewTendersView.fxml");
    }
}
