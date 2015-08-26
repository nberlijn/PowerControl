package nl.nberlijn.powercontrol.controllers.commands;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import nl.nberlijn.powercontrol.config.App;
import nl.nberlijn.powercontrol.kernel.config.Symbols;
import nl.nberlijn.powercontrol.config.Views;

import java.io.IOException;

/**
 * Class representing the menu controller.
 *
 * @author Nils Berlijn
 * @version 1.0
 * @since 1.0
 */
@SuppressWarnings("unused")
public class MenuController {

    /**
     * Handles the settings menu item.
     * Loads in the settings view and renders it to the screen.
     *
     * @throws IOException
     */
    @FXML
    public void handleSettingsMenuItem() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(Views.SETTINGS_VIEW_FILE_PATH));

        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle(Views.SETTINGS_VIEW_TITLE);
        stage.setScene(new Scene(root, Views.SETTINGS_VIEW_WIDTH, Views.SETTINGS_VIEWS_HEIGHT));
        stage.show();
    }

    /**
     * Handles the close menu item.
     * Closes the application.
     */
    @FXML
    public void handleCloseMenuItem() {
        Platform.exit();
    }

    /**
     * Handles the about menu item.
     * Displays an alert window with information about this application to the screen.
     */
    @FXML
    public void handleAboutMenuItem() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("About " + App.NAME);
        alert.setContentText(App.NAME + " version " + App.VERSION + "\nCopyright " + Symbols.COPYRIGHT + " " + App.AUTHOR);
        alert.showAndWait();
    }

}
