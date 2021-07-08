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

public class StudyAnimation extends Application {

    final static javafx.scene.image.Image STUDY1 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study2.png").toString());
    final static javafx.scene.image.Image STUDY2 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study3.png").toString());
    final static javafx.scene.image.Image STUDY3 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study4.png").toString());
    final static javafx.scene.image.Image STUDY4 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study5.png").toString());
    final static javafx.scene.image.Image STUDY5 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study6.png").toString());
    final static javafx.scene.image.Image STUDY6 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study7.png").toString());
    final static javafx.scene.image.Image STUDY7 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study8.png").toString());
    final static javafx.scene.image.Image STUDY8 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study9.png").toString());
    final static javafx.scene.image.Image STUDY9 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study10.png").toString());
    final static javafx.scene.image.Image STUDY10 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study11.png").toString());
    final static javafx.scene.image.Image STUDY11 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study12.png").toString());
    final static javafx.scene.image.Image STUDY12 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study13.png").toString());
    final static javafx.scene.image.Image STUDY13 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study14.png").toString());
    final static javafx.scene.image.Image STUDY14 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study15.png").toString());
    final static javafx.scene.image.Image STUDY15 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study16.png").toString());
    final static javafx.scene.image.Image STUDY16 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study17.png").toString());
    final static javafx.scene.image.Image STUDY17 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study18.png").toString());
    final static javafx.scene.image.Image STUDY18 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study19.png").toString());
    final static javafx.scene.image.Image STUDY19 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study20.png").toString());
    final static javafx.scene.image.Image STUDY20 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study21.png").toString());
    final static javafx.scene.image.Image STUDY21 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study22.png").toString());
    final static javafx.scene.image.Image STUDY22 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study23.png").toString());
    final static javafx.scene.image.Image STUDY23 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study24.png").toString());
    final static javafx.scene.image.Image STUDY24 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study25.png").toString());
    final static javafx.scene.image.Image STUDY25 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study26.png").toString());
    final static javafx.scene.image.Image STUDY26 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study27.png").toString());
    final static javafx.scene.image.Image STUDY27 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study28.png").toString());
    final static javafx.scene.image.Image STUDY28 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study29.png").toString());
    final static javafx.scene.image.Image STUDY29 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study30.png").toString());
    final static javafx.scene.image.Image STUDY30 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study31.png").toString());
    final static javafx.scene.image.Image STUDY31 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study32.png").toString());
    final static javafx.scene.image.Image STUDY32 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study33.png").toString());
    final static javafx.scene.image.Image STUDY33 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study34.png").toString());
    final static javafx.scene.image.Image STUDY34 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study35.png").toString());
    final static javafx.scene.image.Image STUDY35 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study36.png").toString());
    final static javafx.scene.image.Image STUDY36 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study37.png").toString());
    final static javafx.scene.image.Image STUDY37 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study38.png").toString());
    final static javafx.scene.image.Image STUDY38 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study39.png").toString());
    final static javafx.scene.image.Image STUDY39 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study40.png").toString());
    final static javafx.scene.image.Image STUDY40 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study41.png").toString());
    final static javafx.scene.image.Image STUDY41 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study42.png").toString());
    final static javafx.scene.image.Image STUDY42 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study43.png").toString());
    final static javafx.scene.image.Image STUDY43 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study44.png").toString());
    final static javafx.scene.image.Image STUDY44 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study45.png").toString());
    final static javafx.scene.image.Image STUDY45 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study46.png").toString());
    final static javafx.scene.image.Image STUDY46 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study47.png").toString());
    final static javafx.scene.image.Image STUDY47 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study48.png").toString());
    final static javafx.scene.image.Image STUDY48 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study49.png").toString());
    final static javafx.scene.image.Image STUDY49 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study50.png").toString());
    final static javafx.scene.image.Image STUDY50 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study51.png").toString());
    final static javafx.scene.image.Image STUDY51 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study52.png").toString());
    final static javafx.scene.image.Image STUDY52 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study53.png").toString());
    final static javafx.scene.image.Image STUDY53 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study54.png").toString());
    final static javafx.scene.image.Image STUDY54 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study55.png").toString());
    final static javafx.scene.image.Image STUDY55 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study56.png").toString());
    final static javafx.scene.image.Image STUDY56 = new javafx.scene.image.Image(StudyAnimation.class.getResource("/Imagens/Studying/study57.png").toString());


    private Group study;

    @Override
    public void start(Stage animationStage) throws IOException {

        final ImageView study1 = new ImageView(STUDY1);
        final ImageView study2 = new ImageView(STUDY2);
        final ImageView study3 = new ImageView(STUDY3);
        final ImageView study4 = new ImageView(STUDY4);
        final ImageView study5 = new ImageView(STUDY5);
        final ImageView study6 = new ImageView(STUDY6);
        final ImageView study7 = new ImageView(STUDY7);
        final ImageView study8 = new ImageView(STUDY8);
        final ImageView study9 = new ImageView(STUDY9);
        final ImageView study10 = new ImageView(STUDY10);
        final ImageView study11 = new ImageView(STUDY11);
        final ImageView study12 = new ImageView(STUDY12);
        final ImageView study13 = new ImageView(STUDY13);
        final ImageView study14 = new ImageView(STUDY14);
        final ImageView study15 = new ImageView(STUDY15);
        final ImageView study16 = new ImageView(STUDY16);
        final ImageView study17 = new ImageView(STUDY17);
        final ImageView study18 = new ImageView(STUDY18);
        final ImageView study19 = new ImageView(STUDY19);
        final ImageView study20 = new ImageView(STUDY20);
        final ImageView study21 = new ImageView(STUDY21);
        final ImageView study22 = new ImageView(STUDY22);
        final ImageView study23 = new ImageView(STUDY23);
        final ImageView study24 = new ImageView(STUDY24);
        final ImageView study25 = new ImageView(STUDY25);
        final ImageView study26 = new ImageView(STUDY26);
        final ImageView study27 = new ImageView(STUDY27);
        final ImageView study28 = new ImageView(STUDY28);
        final ImageView study29 = new ImageView(STUDY29);
        final ImageView study30 = new ImageView(STUDY30);
        final ImageView study31 = new ImageView(STUDY31);
        final ImageView study32 = new ImageView(STUDY32);
        final ImageView study33 = new ImageView(STUDY33);
        final ImageView study34 = new ImageView(STUDY34);
        final ImageView study35 = new ImageView(STUDY35);
        final ImageView study36 = new ImageView(STUDY36);
        final ImageView study37 = new ImageView(STUDY37);
        final ImageView study38 = new ImageView(STUDY38);
        final ImageView study39 = new ImageView(STUDY39);
        final ImageView study40 = new ImageView(STUDY40);
        final ImageView study41 = new ImageView(STUDY41);
        final ImageView study42 = new ImageView(STUDY42);
        final ImageView study43 = new ImageView(STUDY43);
        final ImageView study44 = new ImageView(STUDY44);
        final ImageView study45 = new ImageView(STUDY45);
        final ImageView study46 = new ImageView(STUDY46);
        final ImageView study47 = new ImageView(STUDY47);
        final ImageView study48 = new ImageView(STUDY48);
        final ImageView study49 = new ImageView(STUDY49);
        final ImageView study50 = new ImageView(STUDY50);
        final ImageView study51 = new ImageView(STUDY51);
        final ImageView study52 = new ImageView(STUDY52);
        final ImageView study53 = new ImageView(STUDY53);
        final ImageView study54 = new ImageView(STUDY54);
        final ImageView study55 = new ImageView(STUDY55);
        final ImageView study56 = new ImageView(STUDY56);

        study = new Group(study1);
        study.setTranslateX(-250);
        study.setTranslateY(0);

        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(500),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study2);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(5000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study3);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(10000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study4);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(20000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study5);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(30000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study6);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(40000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study7);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(50000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study8);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(60000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study9);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(70000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study10);
                }
        ));



        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(80000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study11);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(90000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study12);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(100000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study13);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(110000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study14);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(150000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study15);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(160000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study16);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(200000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study17);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(220000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study18);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(250000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study19);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(300000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study20);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(320000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study21);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(350000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study22);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(400000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study23);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(450000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study24);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(500000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study25);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(550000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study26);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(600000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study27);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(650000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study28);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(700000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study29);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(710000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study30);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(750000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study31);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(800000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study32);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(900000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study33);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(930000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study34);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(960000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study35);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(990000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study36);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study37);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1030000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study38);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1090000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study39);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1120000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study40);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1190000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study41);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1220000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study42);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1280000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study43);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1340000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study44);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1400000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study45);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1450000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study46);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1470000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study47);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1500000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study48);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1530000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study49);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1560000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study50);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1590000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study51);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1640000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study52);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1700000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study53);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1730000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study54);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1760000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study55);
                }
        ));


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1765000),
                (ActionEvent event) -> {
                    study.getChildren().setAll(study56);
                }
        ));

     t.play();

     Parent stopwatch = FXMLLoader.load(getClass().getResource("/GUI/FXML/Stopwatch.fxml"));

     final Group root = new Group(study, stopwatch);

     animationStage.setScene(new Scene(root, 850, 600));
     animationStage.setTitle("Teste Study");
     animationStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }



}
