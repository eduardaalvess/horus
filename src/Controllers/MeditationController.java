package Controllers;

import FXAnimations.MeditationAnimation;
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
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MeditationController implements Initializable {

  //  private final MediaPlayer startMusic = new MediaPlayer(new Media(getClass().getResource("/Musica/music1.mp3").toString()));

    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;
    private boolean started = false;

    @FXML
    private AnchorPane meditationPane;

    @FXML
    private Button backButton;

    @FXML
    private Button playButton;

    @FXML
    private Label hourLabel;

    @FXML
    private Label minLabel;

    @FXML
    private Label secondsLabel;

    @FXML
    private ImageView playImage;


    @FXML
    protected void clickPlayButton(ActionEvent event) {


        playButton = (Button) event.getSource();
        if(((ImageView) playButton.getGraphic()).getImage().getUrl().contains("play")) {
            playImage.setImage(new Image(getClass().getResource("/Imagens/Other/pause.png").toString()));
            stopwatch();
        } else {
            playImage.setImage(new Image(getClass().getResource("/Imagens/Other/pause.png").toString()));
        }
    }


    private void stopwatch() {
        Task<Void> sleeper = new Task<>() {
            @Override
            protected Void call() {
                try {
                    Thread.sleep(15);
                } catch (InterruptedException ignored) {
                }
                return null;
            }
        };
        sleeper.setOnSucceeded(workerStateEvent ->
        {
            if (((ImageView) playButton.getGraphic()).getImage().getUrl().contains("/Imagens/Other/pause.png")) {
                if (seconds <= 9)
                    secondsLabel.setText("0" + seconds);
                if (seconds > 9)
                    secondsLabel.setText("" + seconds);
                if (seconds >= 60) {
                    seconds = 0;
                    minutes++;
                }
                if (minutes <= 9)
                    minLabel.setText("0" + minutes);
                if (minutes > 9)
                    minLabel.setText("" + minutes);
                if (minutes >= 60) {
                    minutes = 0;
                    hours++;
                }
                if (hours <= 9)
                    hourLabel.setText("0" + hours);
                if (hours > 9)
                    hourLabel.setText("" + hours);
                stopwatch();
            }
        });

        new Thread(sleeper).start();

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

    public void start() {

    }

    Button CircularButton(Button bt, String tip) {
        bt.setTooltip(new Tooltip(tip));
        return bt;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        playImage.setImage(new Image(getClass().getResource("/Imagens/Other/play.png").toString()));
        stopwatch();
        seconds = 0;
        minutes = 0;
        hours = 0;
        secondsLabel.setText("00");
        minLabel.setText("00");
        hourLabel.setText("00");



    }
}
