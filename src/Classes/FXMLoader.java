package Classes;

import Controllers.HomePageController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class FXMLoader {
    private Pane view;

    public Pane getPage(String fileName) {

        try {
            URL fileURL = SecondMain.class.getResource("/FXML/" + fileName + ".fxml");

            if(fileURL == null) {
                throw new java.io.FileNotFoundException("Ops! Ocorreu um erro");
            }

            view = new FXMLLoader().load(fileURL);
        } catch (Exception ex) {
            System.out.println("Ops! Ocorreu um erro");

        }

        return view;

    }
}
