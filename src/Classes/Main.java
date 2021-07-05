package Classes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/FXML/Login.fxml"));
            primaryStage.setTitle("HORUS - Building yourself up");
            Image image = new Image("/Imagens/Other/icon-top.png");
            primaryStage.getIcons().add(image);
            primaryStage.setScene(new Scene(root, 700, 550));
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}