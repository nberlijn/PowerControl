package nl.nberlijn.powercontrol.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import nl.nberlijn.powercontrol.config.Views;

import java.io.IOException;

/**
 * Class representing the GUI.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
public final class GUI extends Application {

    /**
     * Starts the GUI.
     */
    public static void start() {
        launch();
    }

    /**
     * Loads in the commands view and renders it to the screen.
     *
     * @param primaryStage The primary stage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(Views.COMMANDS_VIEW_FILE_PATH));

        primaryStage.setResizable(false);
        primaryStage.setTitle(Views.COMMANDS_VIEW_TITLE);
        primaryStage.setScene(new Scene(root, Views.COMMANDS_VIEW_WIDTH, Views.COMMANDS_VIEW_HEIGHT));
        primaryStage.show();
    }

}
