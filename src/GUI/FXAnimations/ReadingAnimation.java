package GUI.FXAnimations;

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

public class ReadingAnimation extends Application {

    final static javafx.scene.image.Image READ1 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading1.png").toString());
    final static javafx.scene.image.Image READ2 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading2.png").toString());
    final static javafx.scene.image.Image READ3 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading3.png").toString());
    final static javafx.scene.image.Image READ4 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading4.png").toString());
    final static javafx.scene.image.Image READ5 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading5.png").toString());
    final static javafx.scene.image.Image READ6 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading6.png").toString());
    final static javafx.scene.image.Image READ7 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading7.png").toString());
    final static javafx.scene.image.Image READ8 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading8.png").toString());
    final static javafx.scene.image.Image READ9 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading9.png").toString());
    final static javafx.scene.image.Image READ10 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading10.png").toString());
    final static javafx.scene.image.Image READ11 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading11.png").toString());
    final static javafx.scene.image.Image READ12 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading12.png").toString());
    final static javafx.scene.image.Image READ13 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading13.png").toString());
    final static javafx.scene.image.Image READ14 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading14.png").toString());
    final static javafx.scene.image.Image READ15 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading15.png").toString());
    final static javafx.scene.image.Image READ16 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading16.png").toString());
    final static javafx.scene.image.Image READ17 = new javafx.scene.image.Image(ReadingAnimation.class.getResource("/Imagens/Reading/reading17.png").toString());


    private Group read;

    @Override
    public void start(Stage animationStage) throws IOException {


        final ImageView read1 = new ImageView(READ1);
        final ImageView read2 = new ImageView(READ2);
        final ImageView read3 = new ImageView(READ3);
        final ImageView read4 = new ImageView(READ4);
        final ImageView read5 = new ImageView(READ5);
        final ImageView read6 = new ImageView(READ6);
        final ImageView read7 = new ImageView(READ7);
        final ImageView read8 = new ImageView(READ8);
        final ImageView read9 = new ImageView(READ9);
        final ImageView read10 = new ImageView(READ10);
        final ImageView read11 = new ImageView(READ11);
        final ImageView read12 = new ImageView(READ12);
        final ImageView read13 = new ImageView(READ13);
        final ImageView read14 = new ImageView(READ14);
        final ImageView read15 = new ImageView(READ15);
        final ImageView read16 = new ImageView(READ16);
        final ImageView read17 = new ImageView(READ17);


        read = new Group(read1);
        read.setTranslateX(-150);
        read.setTranslateY(-100);

        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read2);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(500),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read3);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(800),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read4);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1200),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read5);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1500),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read6);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1800),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read7);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(2000),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read8);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(2300),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read9);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(2700),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read10);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(3000),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read11);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(3300),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read12);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(3600),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read13);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(3900),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read14);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(4200),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read15);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(4500),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read16);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(4800),
                (ActionEvent event) -> {
                    read.getChildren().setAll(read17);
                }
        ));

        t.play();

        Parent stopwatch = FXMLLoader.load(getClass().getResource("/GUI/FXML/Stopwatch.fxml"));

        final Group root = new Group(read, stopwatch);

        animationStage.setScene(new Scene(root, 850, 600));
        animationStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
