package com.example.poject_pranfood.JobSeekers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ScheduleInterviewView {

    @FXML
    private ComboBox<String> AvailableSlotComboBox;
    @FXML
    private ComboBox<String> InterviewInvitationComboBox;
    @FXML
    private Label ScheduleSuccessAlert;

    @FXML
    public void initialize() {
        // Sample invitations
        InterviewInvitationComboBox.setItems(FXCollections.observableArrayList(
                "Software Engineer - Company A",
                "Marketing Officer - Company B",
                "Data Analyst - Company C"
        ));

        // Sample available slots
        AvailableSlotComboBox.setItems(FXCollections.observableArrayList(
                "10:00 AM",
                "12:00 PM",
                "3:00 PM",
                "5:00 PM"
        ));
    }

    @FXML
    public void OnClickScheduleInterview() {
        String selectedInvitation = InterviewInvitationComboBox.getValue();
        String selectedSlot = AvailableSlotComboBox.getValue();

        if (selectedInvitation == null || selectedInvitation.isEmpty()) {
            ScheduleSuccessAlert.setText("⚠ Please select an interview invitation.");
            return;
        }

        if (selectedSlot == null || selectedSlot.isEmpty()) {
            ScheduleSuccessAlert.setText("⚠ Please select an available slot.");
            return;
        }

        // Simulate slot availability check
        if ("12:00 PM".equals(selectedSlot)) {
            ScheduleSuccessAlert.setText("❌ Slot not available. Please choose another.");
        } else {
            ScheduleSuccessAlert.setText("✅ Interview for '" + selectedInvitation +
                    "' scheduled at " + selectedSlot + ".");
        }
    }
}
