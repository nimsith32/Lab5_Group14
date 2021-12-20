/**
 * This program produces a window with a BMI calculator.
 *
 * @author Gaelen Rhoads 100804776
 * @author Nimsith Fernandopulle 100806868
 * @version 1.0
 * @since December 19, 2021
 * @file Main.java
 *
 */

package ca.durhamcollege.oop3200f2021javalab5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Java Lab 5");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}