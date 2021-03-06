package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Utility.WindowStyle;

import javax.swing.*;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/LoginView.fxml"));

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        WindowStyle.allowDrag(root, primaryStage);
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/img/AppIcon.png")));
        primaryStage.setTitle("Kilometer Registratie");

        Scene scene = new Scene(root, 500, 500);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);

        primaryStage.show();

        try {
            URL iconURL = Main.class.getResource("/img/AppIcon.png");
            java.awt.Image image = new ImageIcon(iconURL).getImage();
            com.apple.eawt.Application.getApplication().setDockIconImage(image);
        } catch (Exception ignored) {}
    }

    public static void main(String[] args) {
        launch(args);
    }
}
