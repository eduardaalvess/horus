package Classes;

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
import javafx.util.Duration;
import Database.DatabaseConfigs;

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

    @FXML
    private RadioButton userMale;

    @FXML
    private RadioButton userWoman;

    @FXML
    private RadioButton userOthers;

    @FXML
    private ToggleGroup genders;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
        imageLoad.setVisible(false);

    }

    @FXML
    public void registerAction(ActionEvent even) throws SQLException {
        imageLoad.setVisible(true);
        PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(3));
        pt.setOnFinished(event -> {
            System.out.println("Cadastro realizado com sucesso!");
        });

        pt.play();



    }

    @FXML
    public void loginAction(ActionEvent even1) throws IOException {
        buttonRegister.getScene().getWindow().hide();

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

    public String getGender()
    {
        String gen = "";
        if(userMale.isSelected())
        {
            gen = "Homem";
        }
        else if(userWoman.isSelected())
        {
            gen = "Mulher";
        }
        else if(userOthers.isSelected())
        {
            gen = "Outro";
        }

        return gen;
    }

    public void validateRegister() {

        DatabaseConfigs connectNow = new DatabaseConfigs();
        Connection connectDB = connectNow.getConnection();

        String insert = "INSERT INTO usersinfo(name, email, pass, cpf, location, age, height, weight)"
                + "VALUES (?,?,?,?,?,?,?,?)";
    }
}
