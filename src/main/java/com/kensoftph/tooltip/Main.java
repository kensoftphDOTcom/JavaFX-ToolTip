package com.kensoftph.tooltip;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("tooltip.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Understanding the ToolTip");
        stage.setScene(scene);
        stage.show();*/

        StackPane layout = new StackPane();
        Button btn = new Button("Save");
        layout.getChildren().add(btn);

        Image image = new Image(getClass().getResourceAsStream("/img/icon.png"));
        ImageView iv = new ImageView(image);

        Tooltip tooltip = new Tooltip();
        tooltip.setText("Save the image");
        tooltip.setGraphic(iv);
        tooltip.setStyle("-fx-background-color: black;"+"-fx-text-fill: white");
        btn.setTooltip(tooltip);
        //Tooltip.install(btn, tooltip);

        Scene scene = new Scene(layout, 200, 200);
        stage.setScene(scene);
        stage.setTitle("Understanding the ToolTip");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}