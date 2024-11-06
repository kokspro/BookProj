package com.sundevilbookexchange;

/**
 * Hello world!
 *
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Admin.fxml"));
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.setTitle("Admin User Account - Sun Devil Book Exchange");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}