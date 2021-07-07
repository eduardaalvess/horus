package Classes;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClasseTeste extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Meditation.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("JavaFX");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
