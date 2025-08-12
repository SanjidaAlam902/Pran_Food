package com.example.poject_pranfood;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class createAccountController {

    @FXML
    private TextField fullNameUserTextField;

    @FXML
    private TextField emailUserTextField;

    @FXML
    private ComboBox<String> userRoleComboBox;

    @FXML
    private DatePicker dobUserDatePicker;

    @FXML
    private TextArea userInfoValidateLabel;

    @FXML
    private TextField validateUserTextField;

    @FXML
    private PasswordField createPasswordCreateAccountTextField;

    @FXML
    public void initialize() {
        userRoleComboBox.setItems(FXCollections.observableArrayList(
                "Customer",
                "Sales Manager",
                "Job Seeker",
                "Business Partner",
                "Marketing Officer",
                "Warehouse Manager",
                "Supplier",
                "Production Staff"
        ));
        userRoleComboBox.getSelectionModel().selectFirst();

        userInfoValidateLabel.clear();
        validateUserTextField.clear();
    }

    @FXML
    private void createAccountUserOnClick() {
        String fullName = fullNameUserTextField.getText().trim();
        String email = emailUserTextField.getText().trim();
        String role = userRoleComboBox.getSelectionModel().getSelectedItem();
        LocalDate dob = dobUserDatePicker.getValue();
        String password = createPasswordCreateAccountTextField.getText();

        StringBuilder validationMessages = new StringBuilder();

        if (fullName.isEmpty()) {
            validationMessages.append("- Full Name is required.\n");
        }
        if (email.isEmpty() || !isValidEmail(email)) {
            validationMessages.append("- Valid Email is required.\n");
        }
        if (dob == null) {
            validationMessages.append("- Date of Birth is required.\n");
        }
        if (password.isEmpty() || password.length() < 6) {
            validationMessages.append("- Password must be at least 6 characters.\n");
        }

        if (validationMessages.length() > 0) {
            userInfoValidateLabel.setText(validationMessages.toString());
            validateUserTextField.setText("Validation errors found.");
            return;
        }

        userInfoValidateLabel.setText("Account created successfully for " + fullName + " (" + role + ").");
        validateUserTextField.setText("Success");

        clearInputFields();
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    private void clearInputFields() {
        fullNameUserTextField.clear();
        emailUserTextField.clear();
        dobUserDatePicker.setValue(null);
        createPasswordCreateAccountTextField.clear();
        userRoleComboBox.getSelectionModel().selectFirst();
    }
}
