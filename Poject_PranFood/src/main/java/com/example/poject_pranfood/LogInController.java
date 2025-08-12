package com.example.poject_pranfood;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInController {

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Label loginValidateLabel;

    @FXML
    private void loginOnClick() {
        String username = usernameTextField.getText().trim();
        String password = passwordTextField.getText();

        if (username.isEmpty()) {
            loginValidateLabel.setText("Username cannot be empty.");
            return;
        }

        if (password.isEmpty()) {
            loginValidateLabel.setText("Password cannot be empty.");
            return;
        }

        // Simple hardcoded login example
        if (username.equals("admin") && password.equals("admin123")) {
            loginValidateLabel.setText("Login successful! Welcome, " + username + ".");
            // TODO: Proceed to next screen or dashboard
        } else {
            loginValidateLabel.setText("Invalid username or password. Please try again.");
        }
    }
}
