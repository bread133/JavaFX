package JavaFX;

import Figure.IShape;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import JavaFX.AppController;

public class MainController extends Application
{
    private static AppController appController;

    public static AppController getAppController() {
        return appController;
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().
                getResource("App.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        appController = fxmlLoader.getController();
        stage.setTitle("Геометрические фигуры");
        stage.show();

    }
}