package Classes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    private Button homeButton;

    @FXML
    private Button buildingButton;

    @FXML
    private Button statsButton;

    @FXML
    private Button configsButton;

    @FXML
    private Button logoutButton;

    public void homeStage(ActionEvent event) throws IOException {

        homeButton.getScene().getWindow().hide();

        Stage home = new Stage();
        Parent root = FXMLLoader.load((getClass().getResource("/FXML/Home.fxml")));
        home.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/icon-top.png");
        home.getIcons().add(image);
        Scene scene = new Scene(root);
        home.setScene(scene);
        home.show();
        home.setResizable(false);
    }

    public void logoutAction(ActionEvent e) throws IOException
    {
        logoutButton.getScene().getWindow().hide();

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
