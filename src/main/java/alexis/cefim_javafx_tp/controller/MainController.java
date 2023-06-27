package alexis.cefim_javafx_tp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    protected void onRedRangeMouseRealeased() {
        System.out.println("red");
    }

    @FXML
    protected void onGreenRangeMouseRealeased() {
        System.out.println("green");
    }

    @FXML
    protected void onBlueRangeMouseRealeased() {
        System.out.println("blue");
    }

}