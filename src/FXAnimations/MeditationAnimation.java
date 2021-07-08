package FXAnimations;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;

public class MeditationAnimation extends Application
{

    final static javafx.scene.image.Image MEDITATION1 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med1.png").toString());
    final static javafx.scene.image.Image MEDITATION2 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med2.png").toString());
    final static javafx.scene.image.Image MEDITATION3 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med3.png").toString());
    final static javafx.scene.image.Image MEDITATION4 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med4.png").toString());
    final static javafx.scene.image.Image MEDITATION5 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med5.png").toString());
    final static javafx.scene.image.Image MEDITATION6 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med6.png").toString());
    final static javafx.scene.image.Image MEDITATION7 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med7.png").toString());
    final static javafx.scene.image.Image MEDITATION8 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med8.png").toString());
    final static javafx.scene.image.Image MEDITATION9 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med9.png").toString());
    final static javafx.scene.image.Image MEDITATION10 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med10.png").toString());
    final static javafx.scene.image.Image MEDITATION11 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med11.png").toString());
    final static javafx.scene.image.Image MEDITATION12 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med12.png").toString());
    final static javafx.scene.image.Image MEDITATION13 = new javafx.scene.image.Image(MeditationAnimation.class.getResource("/Imagens/Meditating/med13.png").toString());

    private Group meditation;

    @Override
    public void start(Stage animationStage) throws IOException {
        final ImageView med1 = new ImageView(MEDITATION1);
        final ImageView med2 = new ImageView(MEDITATION2);
        final ImageView med3 = new ImageView(MEDITATION3);
        final ImageView med4 = new ImageView(MEDITATION4);
        final ImageView med5 = new ImageView(MEDITATION5);
        final ImageView med6 = new ImageView(MEDITATION6);
        final ImageView med7 = new ImageView(MEDITATION7);
        final ImageView med8 = new ImageView(MEDITATION8);
        final ImageView med9 = new ImageView(MEDITATION9);
        final ImageView med10 = new ImageView(MEDITATION10);
        final ImageView med11 = new ImageView(MEDITATION11);
        final ImageView med12 = new ImageView(MEDITATION12);
        final ImageView med13 = new ImageView(MEDITATION13);

        meditation = new Group(med1);
        meditation.setTranslateX(-180);
        meditation.setTranslateY(0);

        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med2);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(2000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med3);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(3000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med4);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(4000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med5);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(5000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med6);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(6000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med7);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(7000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med8);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(8000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med9);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(9000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med10);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(10000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med11);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(11000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med12);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(12000),
                (ActionEvent event) -> {
                    meditation.getChildren().setAll(med13);
                }
        ));

        t.play();

        Parent stopwatch = FXMLLoader.load(getClass().getResource("/FXML/Stopwatch.fxml"));

        final Group root = new Group(meditation, stopwatch);
        animationStage.setScene(new Scene(root, 850, 600));
        animationStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }

}
