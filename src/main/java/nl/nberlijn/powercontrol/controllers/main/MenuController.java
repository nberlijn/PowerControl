package nl.nberlijn.powercontrol.controllers.main;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import nl.nberlijn.powercontrol.config.App;
import nl.nberlijn.powercontrol.config.GUI;
import nl.nberlijn.powercontrol.config.Symbols;
import nl.nberlijn.powercontrol.config.Views;

public class MenuController {

    @FXML
    public void handleSettingsMenuItem() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(Views.SETTINGS_VIEW_FILE_PATH));

        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle(GUI.SETTINGS_TITLE);
        stage.setScene(new Scene(root, GUI.SETTINGS_WIDTH, GUI.SETTINGS_HEIGHT));
        stage.show();
    }

    @FXML
    public void handleCloseMenuItem() {
        Platform.exit();
        System.exit(0);
    }

    @FXML
    public void handleAboutMenuItem() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("About " + App.NAME);
        alert.setContentText(App.NAME + " version " + App.VERSION + "\nCopyright " + Symbols.COPYRIGHT + " " + App.AUTHOR);
        alert.showAndWait();
    }

}
