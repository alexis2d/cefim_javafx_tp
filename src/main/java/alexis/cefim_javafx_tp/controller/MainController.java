package alexis.cefim_javafx_tp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MainController {

    @FXML
    private Slider redRange;
    @FXML
    private Slider greenRange;
    @FXML
    private Slider blueRange;

    @FXML
    private TextField redCode;
    @FXML
    private TextField greenCode;
    @FXML
    private TextField blueCode;

    @FXML
    private Rectangle colorRectangle;

    @FXML
    protected void onRedRangeMouseRealeased() {
        redCode.clear();
        redCode.appendText(String.valueOf(Math.round(redRange.getValue())));
        updateColorRectangle();
    }

    @FXML
    protected void onGreenRangeMouseRealeased() {
        greenCode.clear();
        greenCode.appendText(String.valueOf(Math.round(greenRange.getValue())));
        updateColorRectangle();
    }

    @FXML
    protected void onBlueRangeMouseRealeased() {
        blueCode.clear();
        blueCode.appendText(String.valueOf(Math.round(blueRange.getValue())));
        updateColorRectangle();
    }

    private void updateColorRectangle() {
        colorRectangle.setFill(Color.rgb(Integer.parseInt(redCode.getText()),Integer.parseInt(greenCode.getText()),Integer.parseInt(blueCode.getText())));
    }

}