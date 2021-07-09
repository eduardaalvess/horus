package GUI.Controllers;

import Database.ConnectionFactory;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

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
        horusImageView.setVisible(true);
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
        userRegister.getScene().getWindow().hide();

        Stage register = new Stage();
        Parent root = FXMLLoader.load((getClass().getResource("/GUI/FXML/Register.fxml")));
        register.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/Other/icon-top.png");
        register.getIcons().add(image);
        Scene scene = new Scene(root);
        register.setScene(scene);
        register.initStyle(StageStyle.TRANSPARENT);
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
        Parent root = FXMLLoader.load((getClass().getResource("/GUI/FXML/ForgotPassword.fxml")));
        forgetPass.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/Other/icon-top.png");
        forgetPass.getIcons().add(image);
        Scene scene = new Scene(root);
        forgetPass.setScene(scene);
        forgetPass.initStyle(StageStyle.TRANSPARENT);
        forgetPass.show();
        forgetPass.setResizable(false);
    }

    public void validateLogin()
    {
        ConnectionFactory connectNow = new ConnectionFactory();
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
                    userLogin.getScene().getWindow().hide();

                    Stage home = new Stage();
                    Parent root = FXMLLoader.load((getClass().getResource("/GUI/FXML/HomePage.fxml")));
                    home.setTitle("HORUS - Building yourself up");
                    Image image = new Image("/Imagens/Other/icon-top.png");
                    home.getIcons().add(image);
                    Scene scene = new Scene(root);
                    home.setScene(scene);
                    home.initStyle(StageStyle.TRANSPARENT);
                    home.show();
                    home.setResizable(false);

                } else {

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setContentText("Informações inválidas! Verifique suas informações.");
                    alert.show();

                    wrongLogin.setText("Informações inválidas!");
                    imageLoad.setVisible(false);
                }
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }


    }



}