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

public class BuildYOController {

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


    public void homeStage(ActionEvent e) throws IOException {

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


    public void buildingAction(ActionEvent e2) throws IOException {

        buildingButton.getScene().getWindow().hide();

        Stage build = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/BuildYO.fxml"));
        build.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/icon-top.png");
        build.getIcons().add(image);
        Scene scene = new Scene(root);
        build.setScene(scene);
        build.show();
        build.setResizable(false);
    }

    public void statsAction(ActionEvent e1) throws IOException
    {

        statsButton.getScene().getWindow().hide();

        Stage stats = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Stats.fxml"));
        stats.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/icon-top.png");
        stats.getIcons().add(image);
        Scene scene = new Scene(root);
        stats.setScene(scene);
        stats.show();
        stats.setResizable(false);
    }

    public void configsAction(ActionEvent e1) throws IOException
    {
        configsButton.getScene().getWindow().hide();

        Stage configs = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Configs.fxml"));
        configs.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/icon-top.png");
        configs.getIcons().add(image);
        Scene scene = new Scene(root);
        configs.setScene(scene);
        configs.show();
        configs.setResizable(false);
    }



    public void logoutAction(ActionEvent e2) throws IOException
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
