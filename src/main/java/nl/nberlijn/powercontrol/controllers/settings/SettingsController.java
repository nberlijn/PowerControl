package nl.nberlijn.powercontrol.controllers.settings;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import nl.nberlijn.powercontrol.config.Commands;

import java.net.URL;
import java.util.ResourceBundle;

public class SettingsController implements Initializable {

    @FXML
    private GridPane editPowerOnCommand;

    @FXML
    private EditCommandController editPowerOnCommandController;

    @FXML
    private GridPane editPowerOffCommand;

    @FXML
    private EditCommandController editPowerOffCommandController;

    @FXML
    private GridPane editRebootCommand;

    @FXML
    private EditCommandController editRebootCommandController;

    @FXML
    private GridPane editUpdateCommand;

    @FXML
    private EditCommandController editUpdateCommandController;

    @FXML
    private GridPane editCleanCommand;

    @FXML
    private EditCommandController editCleanCommandController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        editPowerOnCommandController.initialize(Commands.POWER_ON);
        editPowerOffCommandController.initialize(Commands.POWER_OFF);
        editRebootCommandController.initialize(Commands.REBOOT);
        editUpdateCommandController.initialize(Commands.UPDATE);
        editCleanCommandController.initialize(Commands.CLEAN);
    }

}
