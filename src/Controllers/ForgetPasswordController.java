package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class ForgetPasswordController {

    @FXML
    private TextField forgetEmail;

    @FXML
    private TextField forgetCPF;

    @FXML
    private PasswordField newPassword;

    @FXML
    private Button confirmNewPassword;

    @FXML
    private Button backToLogin;

    @FXML
    private Button cancelButton;


    public void cancelStage(ActionEvent e2) throws IOException
    {
        Stage cancel = (Stage) cancelButton.getScene().getWindow();
        cancel.close();
    }

    @FXML
    public void backToLoginScene(ActionEvent even1) throws IOException {
        backToLogin.getScene().getWindow().hide();

        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Login.fxml"));
        login.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/icon-top.png");
        login.getIcons().add(image);
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.show();
        login.setResizable(false);
    }
}
