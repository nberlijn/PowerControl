package nl.nberlijn.powercontrol.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;

import nl.nberlijn.powercontrol.services.status.StatusTimer;

import java.net.URL;
import java.util.ResourceBundle;

public class StatusController implements Initializable {

    @FXML
    private Circle statusCircle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        new StatusTimer(statusCircle);
    }

}
