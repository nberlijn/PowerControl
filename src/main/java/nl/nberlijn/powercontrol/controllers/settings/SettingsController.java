package nl.nberlijn.powercontrol.controllers.settings;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import nl.nberlijn.powercontrol.config.Commands;
import nl.nberlijn.powercontrol.config.Views;
import nl.nberlijn.powercontrol.models.CommandModel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SettingsController implements Initializable {

    private final String[] commands = Commands.COMMANDS;
    private final CommandController[] commandController = new CommandController[commands.length];
    @FXML
    private Accordion commandsAccordion;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            TitledPane[] titledPanes = new TitledPane[commands.length];

            for (int i = 0; i < commands.length; i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                GridPane gridPane = fxmlLoader.load(getClass().getResource(Views.COMMAND_FORM_FILE_PATH).openStream());
                CommandModel commandModel = new CommandModel(commands[i]);

                commandController[i] = fxmlLoader.getController();
                commandController[i].setCommandModel(commandModel);
                commandController[i].initializeFields();

                AnchorPane anchorPane = new AnchorPane(gridPane);
                titledPanes[i] = new TitledPane(commandModel.getName(), anchorPane);
            }

            commandsAccordion.getPanes().addAll(titledPanes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleOkButton(ActionEvent actionEvent) {
        for (int i = 0; i < commands.length; i++) {
            commandController[i].update();
        }

        closeWindow(actionEvent);
    }

    @FXML
    public void handleCancelButton(ActionEvent actionEvent) {
        closeWindow(actionEvent);
    }

    private void closeWindow(ActionEvent actionEvent) {
        ((Stage) ((Node) actionEvent.getSource()).getScene().getWindow()).close();
    }

}
