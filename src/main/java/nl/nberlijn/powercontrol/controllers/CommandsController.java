package nl.nberlijn.powercontrol.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.GridPane;

import nl.nberlijn.powercontrol.config.Commands;
import nl.nberlijn.powercontrol.services.command.CommandService;

public class CommandsController {

    @FXML
    private GridPane commandsPane;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    public void handlePowerOnButton() {
        handleCommand(Commands.POWER_ON);
    }

    @FXML
    public void handlePowerOffButton() {
        handleCommand(Commands.POWER_OFF);
    }

    @FXML
    public void handleUpdateButton() {
        handleCommand(Commands.UPDATE);
    }

    @FXML
    public void handleRebootButton() {
        handleCommand(Commands.REBOOT);
    }

    @FXML
    public void handleCleanButton() {
        handleCommand(Commands.CLEAN);
    }

    private void handleCommand(String command) {
        new CommandService(command, commandsPane, progressIndicator).start();
    }

}
