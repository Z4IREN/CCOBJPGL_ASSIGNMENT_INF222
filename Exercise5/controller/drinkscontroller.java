package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class drinkscontroller {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    nesteaapple nesteaapple = new nesteaapple();
    nestealemon nestealemon = new nestealemon();
    lipton lipton = new lipton();
    slurpee slurpee = new slurpee();
    tubig tubig = new tubig();

    public void initialize() {

        nesteaapple.setColor("brown");
        nesteaapple.setTaste("Very Sweet");

        nestealemon.setColor("brown");
        nestealemon.setTaste("Sweet and sour");

        lipton.setColor("kakulay ng redhorse");
        lipton.setTaste("Tropical");

        slurpee.setColor("Depends");
        slurpee.setTaste("VDepends");

        tubig.setColor("transparent");
        tubig.setTaste("nothing");

       
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("NesteaApple is " + nesteaapple.getColor() + " and " + nesteaapple.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("NesteaLemon is " + nestealemon.getColor() + " and " + nestealemon.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("lipton is " + lipton.getColor() + " and " + lipton.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Slurpee " + slurpee.getColor() + " and " + slurpee.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Tubig is " + tubig.getColor() + " and " + tubig.getTaste());
        }

        alert.showAndWait();

    }
}