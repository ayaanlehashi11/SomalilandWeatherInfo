package com.ayaanle.somalilandweatherinfo;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class WeatherApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(WeatherApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 450, 440);
        VBox layout = FXMLLoader.load(new URL(WeatherApplication.class.getResource("hello-view.fxml").toExternalForm()));
        stage.setTitle("Finding some preliminary weather info in your nearby location ... !");
        stage.setScene(new Scene(layout));
        stage.show();
    }

    public static void main(String[] args) {
        WeatherParams wp = new WeatherParams();
        wp.print_location();
        System.out.println("heer kulka: " + wp.getTemp());
        System.out.println("heerka huurka: " +  wp.getHumidity());
        System.out.println("xawaaraha dabaysha: " +  wp.getWindSpeed());
        System.out.println("xagasha dabaysha : " + wp.getWindAngle());
        System.out.println("jihada dabaysha : " + wp.getWindDirection());
        System.out.println("cadaadiska: " + wp.getPressure());

        launch(args);
    }
}