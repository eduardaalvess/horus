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

public class WorkAnimation extends Application {

    final static javafx.scene.image.Image WORK1 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work1.png").toString());
    final static javafx.scene.image.Image WORK2 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work2.png").toString());
    final static javafx.scene.image.Image WORK3 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work3.png").toString());
    final static javafx.scene.image.Image WORK4 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work4.png").toString());
    final static javafx.scene.image.Image WORK5 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work5.png").toString());
    final static javafx.scene.image.Image WORK6 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work6.png").toString());
    final static javafx.scene.image.Image WORK7 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work7.png").toString());
    final static javafx.scene.image.Image WORK8 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work8.png").toString());
    final static javafx.scene.image.Image WORK9 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work9.png").toString());
    final static javafx.scene.image.Image WORK10 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work10.png").toString());
    final static javafx.scene.image.Image WORK11 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work11.png").toString());
    final static javafx.scene.image.Image WORK12 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work12.png").toString());
    final static javafx.scene.image.Image WORK13 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work13.png").toString());
    final static javafx.scene.image.Image WORK14 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work14.png").toString());
    final static javafx.scene.image.Image WORK15 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work15.png").toString());
    final static javafx.scene.image.Image WORK16 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work16.png").toString());
    final static javafx.scene.image.Image WORK17 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work17.png").toString());
    final static javafx.scene.image.Image WORK18 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work18.png").toString());
    final static javafx.scene.image.Image WORK19 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work19.png").toString());
    final static javafx.scene.image.Image WORK20 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work20.png").toString());
    final static javafx.scene.image.Image WORK21 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work21.png").toString());
    final static javafx.scene.image.Image WORK22 = new javafx.scene.image.Image(WorkAnimation.class.getResource("/Imagens/Working/work22.png").toString());


    private Group work;


    @Override
    public void start(Stage animationStage) throws IOException {
        final ImageView work1 = new ImageView(WORK1);
        final ImageView work2 = new ImageView(WORK2);
        final ImageView work3 = new ImageView(WORK3);
        final ImageView work4 = new ImageView(WORK4);
        final ImageView work5 = new ImageView(WORK5);
        final ImageView work6 = new ImageView(WORK6);
        final ImageView work7 = new ImageView(WORK7);
        final ImageView work8 = new ImageView(WORK8);
        final ImageView work9 = new ImageView(WORK9);
        final ImageView work10 = new ImageView(WORK10);
        final ImageView work11 = new ImageView(WORK11);
        final ImageView work12 = new ImageView(WORK12);
        final ImageView work13 = new ImageView(WORK13);
        final ImageView work14 = new ImageView(WORK14);
        final ImageView work15 = new ImageView(WORK15);
        final ImageView work16 = new ImageView(WORK16);
        final ImageView work17 = new ImageView(WORK17);
        final ImageView work18 = new ImageView(WORK18);
        final ImageView work19 = new ImageView(WORK19);
        final ImageView work20 = new ImageView(WORK20);
        final ImageView work21 = new ImageView(WORK21);
        final ImageView work22 = new ImageView(WORK22);


        work = new Group(work1);
        work.setTranslateX(-350);
        work.setTranslateY(-50);

        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(500),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work2);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work3);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(2000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work4);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(3000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work5);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(4000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work6);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(5000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work7);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(6000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work8);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(7000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work9);
                }
        ));



        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(8000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work10);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(9000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work11);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(10000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work12);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(11000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work13);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(12000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work14);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(13000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work15);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(14000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work16);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(15000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work17);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(16000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work18);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(17000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work19);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(18000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work20);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(19000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work21);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(20000),
                (ActionEvent event) -> {
                    work.getChildren().setAll(work22);
                }
        ));

        t.play();

        Parent stopwatch = FXMLLoader.load(getClass().getResource("/FXML/Stopwatch.fxml"));


        final Group root = new Group(work, stopwatch);
        animationStage.setScene(new Scene(root, 850, 600));
        animationStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }



}
