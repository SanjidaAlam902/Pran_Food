package com.example.poject_pranfood.JobSeekers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DownloadGuideView {

    private final String DOWNLOAD_DIR = System.getProperty("user.home") + File.separator + "Downloads";

    @FXML
    public void OnClickStartDownloadResumeGuide() {
        String fileName = "Resume_Guide.txt";
        String content = """
                === Resume Guide ===
                1. Keep it concise and clear.
                2. Highlight relevant experience.
                3. Use bullet points for easy reading.
                4. Include measurable achievements.
                5. Proofread for grammar and spelling.
                """;

        saveFile(fileName, content);
    }

    @FXML
    public void OnClickStartDownloadInterViewTips() {
        String fileName = "Interview_Tips.txt";
        String content = """
                === Interview Tips ===
                1. Research the company before the interview.
                2. Prepare answers for common interview questions.
                3. Dress professionally.
                4. Arrive early and be polite.
                5. Follow up with a thank-you email.
                """;

        saveFile(fileName, content);
    }

    private void saveFile(String fileName, String content) {
        try {
            File dir = new File(DOWNLOAD_DIR);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            File file = new File(dir, fileName);
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(content);
            }

            showAlert(Alert.AlertType.INFORMATION, "Download Complete",
                    "File saved to: " + file.getAbsolutePath());
        } catch (IOException e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Failed to save file: " + e.getMessage());
        }
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}