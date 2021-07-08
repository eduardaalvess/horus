package Controllers;

import Classes.FXMLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {

    @FXML
    private Button homeButton;

    @FXML
    private Button buildButton;

    @FXML
    private Button statsButton;

    @FXML
    private Button configsButton;

    @FXML
    private Button logoutButton;

    @FXML
    private BorderPane homepagePane;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {


    }


    @FXML
    private void changeSceneHome(ActionEvent event) {
        System.out.println("Home");
        FXMLoader object = new FXMLoader();
        Pane view = object.getPage("Home");
        homepagePane.setCenter(view);
    }

    @FXML
    void changeSceneBuild(ActionEvent event) {
        System.out.println("Build");
        FXMLoader object = new FXMLoader();
        Pane view = object.getPage("Build");
        homepagePane.setCenter(view);
    }

    @FXML
    void changeSceneEstatisticas(ActionEvent event) {
        System.out.println("Stats");
        FXMLoader object = new FXMLoader();
        Pane view = object.getPage("Stats");
        homepagePane.setCenter(view);
    }

    @FXML
    void changeSceneConfiguracoes(ActionEvent event) {

        System.out.println("Configs");
        FXMLoader object = new FXMLoader();
        Pane view = object.getPage("Configs");
        homepagePane.setCenter(view);
    }


    public void logoutAction(ActionEvent e2) throws IOException
    {
        logoutButton.getScene().getWindow().hide();

        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Login.fxml"));
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
