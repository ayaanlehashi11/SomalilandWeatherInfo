package com.ayaanle.somalilandweatherinfo;


import com.ayaanle.somalilandweatherinfo.model.WeatherModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
public class WeatherApplication extends Application {
    @SuppressWarnings("deprecation")
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(WeatherApplication.class.getResource("weather.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 450, 440);
        VBox layout = FXMLLoader.load(Objects.requireNonNull(WeatherApplication.class.getResource("weather.fxml")));
        stage.setTitle("Finding some preliminary weather info in your nearby location ... !");
        stage.setScene(new Scene(layout));;
        stage.show();
    }

    public static void main(String[] args)
    {
        String url = "https://api.weatherapi.com/v1/current.json?key=API_KEY&aqi=yes";
        WeatherModel wm =  new WeatherModel();
        System.out.println(wm.getPressure());
        System.out.println(wm.getHumidity());
        System.out.println(wm.getTemp());
        launch(args);
    }
}
