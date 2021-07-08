package GUI.Controllers;


import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
import Database.DatabaseConfigs;
import Models.Users;

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
    public void registerAction(ActionEvent even) throws SQLException {
        imageLoad.setVisible(true);
        validateRegister();

        PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(3));
        pt.play();
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

    public void validateRegister() {

            DatabaseConfigs connectNow = new DatabaseConfigs();
            Connection connectDB = connectNow.getConnection();

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
                alert.setContentText("Por favor, entre com todas as infomações");
                imageLoad.setVisible(false);
                alert.showAndWait();
            }

            else {


            String insertFields = "INSERT INTO usersinfo(name, email, pass, cpf, location, age, height) VALUES ('";
            String insertValues = name + "','" + email + "','" + pass + "','" + cpf + "','" + location + "','" + age + "','" + height + "')";
            String insertToRegister = insertFields + insertValues;

            try {
                Statement statement = connectDB.createStatement();
                statement.executeUpdate(insertToRegister);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
}
}
