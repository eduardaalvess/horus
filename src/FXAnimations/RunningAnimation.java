package FXAnimations;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;

public class RunningAnimation extends Application {


    final static javafx.scene.image.Image RUN1 = new javafx.scene.image.Image(RunningAnimation.class.getResource("/FXAnimations/AnimationsFX/Running/run1.png").toString());
    final static javafx.scene.image.Image RUN2 = new javafx.scene.image.Image(RunningAnimation.class.getResource("/FXAnimations/AnimationsFX/Running/run2.png").toString());
    final static javafx.scene.image.Image RUN3 = new javafx.scene.image.Image(RunningAnimation.class.getResource("/FXAnimations/AnimationsFX/Running/run3.png").toString());
    final static javafx.scene.image.Image RUN4 = new javafx.scene.image.Image(RunningAnimation.class.getResource("/FXAnimations/AnimationsFX/Running/run4.png").toString());
    final static javafx.scene.image.Image RUN5 = new javafx.scene.image.Image(RunningAnimation.class.getResource("/FXAnimations/AnimationsFX/Running/run5.png").toString());
    final static javafx.scene.image.Image RUN6 = new javafx.scene.image.Image(RunningAnimation.class.getResource("/FXAnimations/AnimationsFX/Running/run6.png").toString());
    final static javafx.scene.image.Image RUN7 = new javafx.scene.image.Image(RunningAnimation.class.getResource("/FXAnimations/AnimationsFX/Running/run7.png").toString());
    final static javafx.scene.image.Image RUN8 = new javafx.scene.image.Image(RunningAnimation.class.getResource("/FXAnimations/AnimationsFX/Running/run8.png").toString());


    private Group run;

    @Override
    public void start(Stage animationStage) throws IOException {

        final ImageView run1 = new ImageView(RUN1);
        final ImageView run2 = new ImageView(RUN2);
        final ImageView run3 = new ImageView(RUN3);
        final ImageView run4 = new ImageView(RUN4);
        final ImageView run5 = new ImageView(RUN5);
        final ImageView run6 = new ImageView(RUN6);
        final ImageView run7 = new ImageView(RUN7);
        final ImageView run8 = new ImageView(RUN8);

        run = new Group(run1);
        run.setTranslateX(200);
        run.setTranslateY(220);

        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    run.getChildren().setAll(run2);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(300),
                (ActionEvent event) -> {
                    run.getChildren().setAll(run3);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(400),
                (ActionEvent event) -> {
                    run.getChildren().setAll(run4);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(500),
                (ActionEvent event) -> {
                    run.getChildren().setAll(run5);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(600),
                (ActionEvent event) -> {
                    run.getChildren().setAll(run6);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(700),
                (ActionEvent event) -> {
                    run.getChildren().setAll(run7);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(800),
                (ActionEvent event) -> {
                    run.getChildren().setAll(run8);
                }
        ));

        t.play();

        Rectangle sky = new Rectangle(600, 600);
        sky.setFill(Color.LIGHTBLUE);

        final Group root = new Group(sky, run);

        animationStage.setScene(new Scene(root, 500, 500));
        animationStage.setTitle("Teste");
        animationStage.show();



    }

    public static void main(String[] args) {
        Application.launch(args);
        launch(args);
    }


}
