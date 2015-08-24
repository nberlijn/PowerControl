package nl.nberlijn.powercontrol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import nl.nberlijn.powercontrol.config.GUI;
import nl.nberlijn.powercontrol.config.Views;
import nl.nberlijn.powercontrol.kernel.Kernel;

import java.io.IOException;

/**
 * Class representing the main.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("WeakerAccess")
public final class Main extends Application {

    /**
     * Starts the application.
     *
     * @param args The arguments
     */
    public static void main(String[] args) throws Exception {
        new Kernel();

        launch(args);
    }

    /**
     * Starts the application.
     * Loads in the commands view and renders it to the screen.
     *
     * @param primaryStage The primary stage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(Views.COMMANDS_VIEW_FILE_PATH));

        primaryStage.setResizable(false);
        primaryStage.setTitle(GUI.COMMANDS_TITLE);
        primaryStage.setScene(new Scene(root, GUI.COMMANDS_WIDTH, GUI.COMMANDS_HEIGHT));
        primaryStage.show();
    }

}
