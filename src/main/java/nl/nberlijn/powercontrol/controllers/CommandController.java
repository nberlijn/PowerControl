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
        executeCommand(Commands.INSTANCE.POWER_ON_ALIAS);
    }

    @FXML
    public void handlePowerOff() {
        executeCommand(Commands.INSTANCE.POWER_OFF_ALIAS);
    }

    @FXML
    public void handleUpdate() {
        executeCommand(Commands.INSTANCE.UPDATE_ALIAS);
    }

    @FXML
    public void handleReboot() {
        executeCommand(Commands.INSTANCE.REBOOT_ALIAS);
    }

    @FXML
    public void handleClean() {
        executeCommand(Commands.INSTANCE.CLEAN_ALIAS);
    }

    private void executeCommand(String command) {
        new CommandService(command, commandsPane, progressIndicator).start();
    }

}
