package nl.nberlijn.powercontrol.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.GridPane;

import nl.nberlijn.powercontrol.config.Commands;
import nl.nberlijn.powercontrol.services.command.CommandService;

public class CommandController {

    @FXML
    private GridPane commandsPane;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    public void handlePowerOn() {
        executeCommand(Commands.POWER_ON_ALIAS);
    }

    @FXML
    public void handlePowerOff() {
        executeCommand(Commands.POWER_OFF_ALIAS);
    }

    @FXML
    public void handleUpdate() {
        executeCommand(Commands.UPDATE_ALIAS);
    }

    @FXML
    public void handleReboot() {
        executeCommand(Commands.REBOOT_ALIAS);
    }

    @FXML
    public void handleClean() {
        executeCommand(Commands.CLEAN_ALIAS);
    }

    private void executeCommand(String command) {
        new CommandService(command, commandsPane, progressIndicator).start();
    }

}
