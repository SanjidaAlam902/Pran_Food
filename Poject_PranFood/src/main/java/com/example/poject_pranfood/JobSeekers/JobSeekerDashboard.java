package com.example.poject_pranfood.JobSeekers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class JobSeekerDashboard {

    @FXML
    private AnchorPane dashboardContentPane; // Placeholder for loading pages

    private void loadPage(String fxmlFile) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane view = fxmlLoader.load();
            dashboardContentPane.getChildren().setAll(view); // Replace content
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void OnClickBrowseJobNavi(ActionEvent actionEvent) {
        loadPage("BrowseJobViewSeeker.fxml");
    }

    @FXML
    public void OnClickApplyForJobsNavi(ActionEvent actionEvent) {
        loadPage("ApplyForJobViewSeeker.fxml");
    }

    @FXML
    public void OnClickMyApplicationsNavi(ActionEvent actionEvent) {
        loadPage("MyApplicationsViewSeeker.fxml");
    }

    @FXML
    public void OnClickMyTestNavi(ActionEvent actionEvent) {
        loadPage("OnlineAssessmentViewSeeker.fxml");
    }

    @FXML
    public void OnClickScheduleInterviewNavi(ActionEvent actionEvent) {
        loadPage("ScheduleInterviewViewSeeker.fxml");
    }

    @FXML
    public void OnClickJobAlertPreferencesNavi(ActionEvent actionEvent) {
        loadPage("JobAlertPreferencesViewSeeker.fxml");
    }

    @FXML
    public void OnClickDownloadTipsResumeGuideNavi(ActionEvent actionEvent) {
        loadPage("DownloadGuideViewSeeker.fxml");
    }

    @FXML
    public void OnClickSignInNavigate(ActionEvent actionEvent) {
        loadPage("Login.fxml");
    }

    @FXML
    public void OnClickLogOutNavigate(ActionEvent actionEvent) {
        loadPage("Login.fxml");
    }
}
