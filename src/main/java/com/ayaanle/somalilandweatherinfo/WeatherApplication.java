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
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        String API_KEY = "";
        double  latitude ,longtitude;
        String url = "https://api.weatherapi.com/v1/current.json?key=9ea1d4789e9e4883aec81714232112&q=hargeisa&aqi=yes";
        WeatherData wi = new WeatherData();
        System.out.println(wi.dataScrapper(url));
        launch();
    }
}