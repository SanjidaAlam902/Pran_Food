package com.example.poject_pranfood.BusinessPartners;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert.AlertType;

public class TenderNotificationPreferencesView {

    @FXML
    private ComboBox<String> InterestCategoryComboBox;

    @FXML
    public void initialize() {
        // Populate interest categories
        InterestCategoryComboBox.setItems(FXCollections.observableArrayList(
                "Construction",
                "IT Services",
                "Food Processing",
                "Logistics",
                "Healthcare"
        ));

        // Optional: Select first by default
        InterestCategoryComboBox.getSelectionModel().selectFirst();
    }

    @FXML
    private void OnClickSavePreferences() {
        String selectedCategory = InterestCategoryComboBox.getSelectionModel().getSelectedItem();

        if (selectedCategory == null || selectedCategory.isEmpty()) {
            showAlert("Please select an interest category before saving.");
            return;
        }

        // TODO: Add logic to save preferences (e.g., save to DB or file)

        showAlert("Your preferences for '" + selectedCategory + "' have been saved successfully.");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Save Preferences");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
