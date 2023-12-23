package com.ayaanle.somalilandweatherinfo;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WeatherApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WeatherApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 440);
        stage.setTitle("Finding some preliminary weather info in your nearby location ... !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        WeatherParams wp = new WeatherParams();
        System.out.println(wp.getPressure());
        //launch();
    }
}