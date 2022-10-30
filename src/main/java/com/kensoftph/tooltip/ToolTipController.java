package com.kensoftph.tooltip;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ToolTipController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}