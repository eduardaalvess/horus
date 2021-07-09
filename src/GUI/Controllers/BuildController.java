package GUI.Controllers;

import GUI.FXAnimations.MeditationAnimation;
import GUI.FXAnimations.RunningAnimation;
import GUI.FXAnimations.StudyAnimation;
import GUI.FXAnimations.WorkAnimation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


public class BuildController {

    @FXML
    private AnchorPane anchorBuild;

    @FXML
    private Button studyButton;

    @FXML
    private Button workoutButton;

    @FXML
    private Button mindfButton;

    @FXML
    private Button workButton;




    @FXML
    void pressMindfulnessButton(ActionEvent event) throws IOException {
        mindfButton.getScene().getWindow().hide();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        MeditationAnimation meditationAnimation = new MeditationAnimation();
        meditationAnimation.start(stage);

    }

    @FXML
    void pressStudyButton(ActionEvent event) throws IOException {
        studyButton.getScene().getWindow().hide();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        StudyAnimation studyAnimation = new StudyAnimation();
        studyAnimation.start(stage);

    }

    @FXML
    void pressWorkButton(ActionEvent event) throws IOException {
        workButton.getScene().getWindow().hide();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        WorkAnimation workAnimation = new WorkAnimation();
        workAnimation.start(stage);
    }

    @FXML
    void pressWorkoutButton(ActionEvent event) throws IOException {
        workoutButton.getScene().getWindow().hide();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        RunningAnimation runningAnimation = new RunningAnimation();
        runningAnimation.start(stage);

    }
}
