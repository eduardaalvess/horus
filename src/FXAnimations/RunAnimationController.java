package FXAnimations;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class RunAnimationController {

    @FXML
    ImageView rotateImage;

    Timeline rotate = new Timeline();

    public void rotateImage() {
        DoubleProperty r = rotateImage.rotateProperty();

        rotate.getKeyFrames().addAll(
                new KeyFrame(new Duration(0), new KeyValue(r, 0)),
                new KeyFrame(new Duration(23000), new KeyValue(r, -360))
        );

        rotate.play();
    }

}
