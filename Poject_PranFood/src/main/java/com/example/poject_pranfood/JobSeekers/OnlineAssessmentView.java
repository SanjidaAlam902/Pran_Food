package com.example.poject_pranfood.JobSeekers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class OnlineAssessmentView {

    @FXML
    private Label MarksShowLabel;

    // Question 1
    @FXML
    private RadioButton Q1RightAnsRadioButton;
    @FXML
    private RadioButton Q1WrongAnsRadioButton;

    // Question 2
    @FXML
    private RadioButton Q2RightAnsRadioButton;
    @FXML
    private RadioButton Q2WrongAnsRadioButton;

    // Question 3
    @FXML
    private RadioButton Q3RightAnsRadioButton;
    @FXML
    private RadioButton Q3WrongAnsRadioButton;

    // Question 4
    @FXML
    private RadioButton Q4RightAnsRadioButton;
    @FXML
    private RadioButton Q4WrongAnsRadioButton;

    // Question 5
    @FXML
    private RadioButton Q5RightAnsRadioButton;
    @FXML
    private RadioButton Q5WrongAnsRadioButton;

    @FXML
    public void OnClickAssessmentSubmitToCheck() {
        int score = 0;

        if (Q1RightAnsRadioButton.isSelected()) score++;
        if (Q2RightAnsRadioButton.isSelected()) score++;
        if (Q3RightAnsRadioButton.isSelected()) score++;
        if (Q4RightAnsRadioButton.isSelected()) score++;
        if (Q5RightAnsRadioButton.isSelected()) score++;

        MarksShowLabel.setText(score + "/5");
    }
}
