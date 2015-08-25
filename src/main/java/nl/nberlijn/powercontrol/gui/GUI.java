package nl.nberlijn.powercontrol.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static nl.nberlijn.powercontrol.config.Views.*;

/**
 * Class representing the gui.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public final class GUI extends Application {

    /**
     * Starts the application gui.
     */
    public static void start() {
        launch();
    }

    /**
     * Starts the application gui.
     * Loads in the commands view and renders it to the screen.
     *
     * @param primaryStage The primary stage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(COMMANDS_VIEW_FILE_PATH));

        primaryStage.setResizable(false);
        primaryStage.setTitle(COMMANDS_VIEW_TITLE);
        primaryStage.setScene(new Scene(root, COMMANDS_VIEW_WIDTH, COMMANDS_VIEW_HEIGHT));
        primaryStage.show();
    }

}
