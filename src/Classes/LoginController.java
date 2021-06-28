package Classes;

import Database.DatabaseConfigs;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable
{

    @FXML
    private TextField userEmail;

    @FXML
    private PasswordField userPassword;

    @FXML
    private Button userLogin;

    @FXML
    private Button userRegister;

    @FXML
    private Button forgotThePassword;

    @FXML
    private Label wrongLogin;

    @FXML
    private ImageView imageLoad;

    @FXML
    private CheckBox remember;

    @FXML
    private Button cancelButton;

    @FXML
    private ImageView horusImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

        imageLoad.setVisible(false);
    }


    @FXML
    public void loginAction(ActionEvent e)
    {

        imageLoad.setVisible(true);
        PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(3));

        if(userEmail.getText().isBlank() == true && userPassword.getText().isBlank() == true)
        {
            wrongLogin.setText("Por favor, digite email e senha!");
            imageLoad.setVisible(false);

        } else {
            validateLogin();
        }

        pt.play();
    }

    @FXML
    public void registerScene(ActionEvent e1) throws IOException
    {
        userLogin.getScene().getWindow().hide();

        Stage register = new Stage();
        Parent root = FXMLLoader.load((getClass().getResource("/FXML/Register.fxml")));
        register.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/icon-top.png");
        register.getIcons().add(image);
        Scene scene = new Scene(root);
        register.setScene(scene);
        register.show();
        register.setResizable(false);
    }

    public void cancelStage(ActionEvent e2) throws IOException
    {
        Stage cancel = (Stage) cancelButton.getScene().getWindow();
        cancel.close();
    }

    @FXML
    public void forgetPassScene(ActionEvent e3) throws IOException
    {

        forgotThePassword.getScene().getWindow().hide();

        Stage forgetPass = new Stage();
        Parent root = FXMLLoader.load((getClass().getResource("/FXML/PasswordForget.fxml")));
        forgetPass.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/icon-top.png");
        forgetPass.getIcons().add(image);
        Scene scene = new Scene(root);
        forgetPass.setScene(scene);
        forgetPass.show();
        forgetPass.setResizable(false);
    }

    public void validateLogin()
    {
        DatabaseConfigs connectNow = new DatabaseConfigs();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM usersinfo WHERE email = '" + userEmail.getText() + "'AND pass = '" + userPassword.getText() + "'";

        try
        {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while(queryResult.next())
            {
                if(queryResult.getInt(1) == 1)
                {
                    wrongLogin.setText("Sucesso!");
                } else {
                    wrongLogin.setText("Informações inválidas!");
                }
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }


    }

}