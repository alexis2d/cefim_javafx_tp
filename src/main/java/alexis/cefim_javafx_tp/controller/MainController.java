package alexis.cefim_javafx_tp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import alexis.cefim_javafx_tp.model.CustomColor;

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
    private TextField hexCode;

    @FXML
    private Rectangle colorRectangle;

    private CustomColor color;

    @FXML
    protected void initialize() {
        color = new CustomColor((int) redRange.getValue(), (int) greenRange.getValue(), (int) blueRange.getValue());
    }

    @FXML
    protected void onRedRangeChanged() {
        int newRedInt = (int) redRange.getValue();
        redCode.clear();
        redCode.appendText(String.valueOf(newRedInt));
        color.setRed(newRedInt);
        update();
    }

    @FXML
    protected void onGreenRangeChanged() {
        int newGreenInt = (int) greenRange.getValue();
        greenCode.clear();
        greenCode.appendText(String.valueOf(newGreenInt));
        color.setGreen(newGreenInt);
        update();
    }

    @FXML
    protected void onBlueRangeChanged() {
        int newBlueInt = (int) blueRange.getValue();
        blueCode.clear();
        blueCode.appendText(String.valueOf(newBlueInt));
        color.setBlue(newBlueInt);
        update();
    }

    @FXML
    protected void onRedCodeChanged() {
        String redCodeString = redCode.getText();
        color.setRed(Integer.parseInt(redCodeString));
        redRange.setValue(Double.parseDouble(redCodeString));
        update();
    }

    @FXML
    protected void onGreenCodeChanged() {
        String greenCodeString = greenCode.getText();
        color.setRed(Integer.parseInt(greenCodeString));
        greenRange.setValue(Double.parseDouble(greenCodeString));
        update();
    }

    @FXML
    protected void onBlueCodeChanged() {
        String blueCodeString = blueCode.getText();
        color.setRed(Integer.parseInt(blueCodeString));
        blueRange.setValue(Double.parseDouble(blueCodeString));
        update();
    }

    @FXML
    protected void onHexCodeChanged() {
        color.setHexValue(hexCode.getText());
        update();
    }

    private void update() {
        hexCode.clear();
        hexCode.appendText(color.getHexValue());
        redCode.clear();
        redCode.appendText(String.valueOf(color.getRed()));
        greenCode.clear();
        greenCode.appendText(String.valueOf(color.getGreen()));
        blueCode.clear();
        blueCode.appendText(String.valueOf(color.getBlue()));
        colorRectangle.setFill(Color.web(color.getHexValue()));
    }

}