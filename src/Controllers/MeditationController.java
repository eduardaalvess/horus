package Controllers;

import FXAnimations.MeditationAnimation;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class MeditationController implements Initializable {

    private double xOffset = 0;
    private double yOffset = 0;

    Timeline timeline;

    LocalTime time = LocalTime.parse("00:00:00");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");



    @FXML
    private AnchorPane meditationPane;

    @FXML
    private Button backButton;

    @FXML
    private Button playButton;

    @FXML
    private Label timer;

    @FXML
    private ImageView playImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        timeline = new Timeline(new KeyFrame(Duration.millis(1000), ae -> incrementTime()));
        timeline.setCycleCount(Animation.INDEFINITE);

    }

    private void incrementTime() {
        time = time.plusSeconds(1);
        timer.setText(time.format(dtf));
    }

    @FXML
    protected void clickPlayButton(ActionEvent event) {
        timeline.play();
        playButton.setDisable(true);
    }

    @FXML
    private void endTimer(ActionEvent event) {
        if (playButton.isDisable()) {
            timeline.stop();
            playButton.setDisable(false);
            time = LocalTime.parse("00:00:00");
            timer.setText(time.format(dtf));
        }
    }

    @FXML
    void backToMenu(ActionEvent event) throws IOException {

        backButton.getScene().getWindow().hide();

        Stage back = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/HomePage.fxml"));
        back.setTitle("HORUS - Building yourself up");
        Image image = new Image("/Imagens/Other/icon-top.png");
        back.getIcons().add(image);
        back.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        back.setScene(scene);
        back.show();
        back.setResizable(false);

    }

}
