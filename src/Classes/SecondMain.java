package Classes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SecondMain extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/FXML/HomePage.fxml"));
            Scene scene = new Scene(root, 850, 650);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setResizable(false);
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
