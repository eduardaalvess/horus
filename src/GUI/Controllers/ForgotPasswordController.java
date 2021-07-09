package GUI.Controllers;

import Database.ConnectionFactory;
import Models.DAO.UserDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class ForgotPasswordController {

    @FXML
    private TextField forgetEmail;

    @FXML
    private TextField forgetCPF;

    @FXML
    private PasswordField newPassword;

    @FXML
    private Button confirmNewPasswordButton;

    @FXML
    private Button backToLogin;

    @FXML
    private Button cancelButton;

    @FXML
    public void confirmNewPassword() throws SQLException {

        String email = forgetEmail.getText();
        String cpf = forgetCPF.getText();
        String newPass = newPassword.getText();

        if(email.isEmpty() || cpf.isEmpty() || newPass.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Por favor, entre com todas as informações");
            alert.showAndWait();
        } else {
            validateNewPass();
        }
    }

    private void validateNewPass() throws SQLException {
        ConnectionFactory connectNow = new ConnectionFactory();
        Connection connectDB = connectNow.getConnection();
        UserDAO dao = new UserDAO();

        try {

            if (dao.updatePass(newPassword.getText(), forgetEmail.getText(), forgetCPF.getText())) {

                System.out.println("Informações salvas com sucesso");

            }
        } catch (SQLException sqlException) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Falha na atualização de senha!");
        }

    }


    public void cancelStage(ActionEvent e2) throws IOException
    {
        Stage cancel = (Stage) cancelButton.getScene().getWindow();
        cancel.close();
    }

    @FXML
    public void backToLoginScene(ActionEvent even1) throws IOException {
        backToLogin.getScene().getWindow().hide();

        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/GUI/FXML/Login.fxml"));
        login.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/Other/icon-top.png");
        login.getIcons().add(image);
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.initStyle(StageStyle.TRANSPARENT);
        login.show();
        login.setResizable(false);
    }
}
