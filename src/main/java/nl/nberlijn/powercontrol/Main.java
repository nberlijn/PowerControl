package nl.nberlijn.powercontrol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import nl.nberlijn.powercontrol.config.GUI;
import nl.nberlijn.powercontrol.config.Views;

import java.io.IOException;

/**
 * Class representing the main.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public class Main extends Application {

    /**
     * The main method to start the application.
     *
     * @param args The arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * The start method of the application.
     * Loads in the main view and renders it to the screen.
     *
     * @param primaryStage The primary stage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(Views.MAIN_VIEW_FILE_PATH));

        primaryStage.setResizable(false);
        primaryStage.setTitle(GUI.MAIN_TITLE);
        primaryStage.setScene(new Scene(root, GUI.MAIN_WIDTH, GUI.MAIN_HEIGHT));
        primaryStage.show();
    }

}
