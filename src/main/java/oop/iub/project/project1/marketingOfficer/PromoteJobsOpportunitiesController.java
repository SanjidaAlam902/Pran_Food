package oop.iub.project.project1.marketingOfficer;




import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class    PromoteJobsOpportunitiesController {
    @javafx.fxml.FXML
    private ComboBox<String> requiredSkillsCB;
    @javafx.fxml.FXML
    private TextField salaryTF;
    @javafx.fxml.FXML
    private TextField jobTitleTF;
    @javafx.fxml.FXML
    private TextField qualificationsTF;
    @javafx.fxml.FXML
    private TableColumn<promoteJobsOpportunities, String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<promoteJobsOpportunities, Double> SalaryCol;
    @javafx.fxml.FXML
    private TableColumn<promoteJobsOpportunities, String> qualificationCol;
    @javafx.fxml.FXML
    private TableColumn<promoteJobsOpportunities, String> skillCol;
    @javafx.fxml.FXML
    private TableView<promoteJobsOpportunities> JobsTC;
    @javafx.fxml.FXML
    private Label outputLabel;

    String jobTitle;
    String requiredSkill;
    String Quualification;
    double salary;

    ArrayList<promoteJobsOpportunities> promoteJobsOpportunitiesArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        titleCol.setCellValueFactory((new PropertyValueFactory<>("jobTitle")));
        skillCol.setCellValueFactory((new PropertyValueFactory<>("requiredSkill")));
        qualificationCol.setCellValueFactory(new PropertyValueFactory<>("Quualification"));
        SalaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));

        requiredSkillsCB.getItems().addAll("Communication", "Team Management", "Problem Solving", "Time Management");

    }


    @javafx.fxml.FXML
    public void addInfoOA(ActionEvent actionEvent) {
        if (jobTitleTF.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Title");
            return;

        }

        if (requiredSkillsCB.getValue().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Skill");
            return;

        }
        if (qualificationsTF.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Qualification");
            return;

        }
        if (salaryTF.getText().trim().isEmpty()) {
            outputLabel.setText("Enter Proper Amount Of Salary");
            return;

        }

         jobTitle = jobTitleTF.getText();
        requiredSkill = requiredSkillsCB.getValue();
        Quualification = qualificationsTF.getText();
        salary = Double.parseDouble(salaryTF.getText());
        promoteJobsOpportunities pjo = new promoteJobsOpportunities(
                jobTitle,
                requiredSkill,
                Quualification,
                salary);

        promoteJobsOpportunitiesArrayList.add(pjo);
        System.out.println(promoteJobsOpportunitiesArrayList);
            JobsTC.getItems().clear();

        JobsTC.getItems().addAll(promoteJobsOpportunitiesArrayList);
        outputLabel.setText("Data Saved");

    }
}






