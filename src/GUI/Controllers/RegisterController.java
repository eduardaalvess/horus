package GUI.Controllers;


import Models.DAO.UserDAO;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import Database.ConnectionFactory;

public class RegisterController implements Initializable {

    @FXML
    private TextField userName;

    @FXML
    private TextField userEmail;

    @FXML
    private PasswordField userPassword;

    @FXML
    private TextField userAge;

    @FXML
    private TextField userHeight;

    @FXML
    private TextField userCPF;

    @FXML
    private TextField userLocation;

    @FXML
    private Button buttonRegister;

    @FXML
    private Button userLogin;

    @FXML
    private ImageView imageLoad;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
        imageLoad.setVisible(false);

    }

    @FXML
    public void registerAction(ActionEvent even) throws IOException, SQLException {

        imageLoad.setVisible(true);
        PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(3));
        pt.play();

        String name = userName.getText();
        String email = userEmail.getText();
        String pass = userPassword.getText();
        String cpf = userCPF.getText();
        String location = userLocation.getText();
        String age = userAge.getText();
        String height = userHeight.getText();

        if(name.isEmpty() || email.isEmpty() || pass.isEmpty() || cpf.isEmpty() || location.isEmpty() || age.isEmpty() || height.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Por favor, entre com todas as informações");
            imageLoad.setVisible(false);
            alert.showAndWait();
        } else {
            validateRegister();
        }
        }

    @FXML
    public void loginAction(ActionEvent even1) throws IOException {
        buttonRegister.getScene().getWindow().hide();

        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/GUI/FXML/Login.fxml"));
        login.setTitle("HORUS - Building yourself up");
        login.setResizable(false);
        Image image = new Image("/Imagens/Other/icon-top.png");
        login.getIcons().add(image);
        login.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.show();
    }

    public void validateRegister() throws IOException, SQLException {

            ConnectionFactory connectNow = new ConnectionFactory();
            Connection connectDB = connectNow.getConnection();
            UserDAO dao = new UserDAO();

            if(dao.create(userName.getText(), userEmail.getText(), userPassword.getText(), userCPF.getText(), userLocation.getText(), userAge.getText(), userHeight.getText())) {

                System.out.println("Informações salvas com sucesso!");


                }

            }
    }
