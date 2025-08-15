package oop.iub.project.project1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class createAccountController
{
    @javafx.fxml.FXML
    private DatePicker dobUserDatePicker;
    @javafx.fxml.FXML
    private TextArea userInfoValidateLabel;
    @javafx.fxml.FXML
    private TextField fullNameUserTextField;
    @javafx.fxml.FXML
    private TextField validateUserTextField;
    @javafx.fxml.FXML
    private ComboBox userRoleComboBox;
    @javafx.fxml.FXML
    private PasswordField createPasswordCreateAccountTextField;
    @javafx.fxml.FXML
    private TextField emailUserTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccountUserOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LogIn.fxml"));
            Scene scene  = new Scene(fxmlLoader.load());
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