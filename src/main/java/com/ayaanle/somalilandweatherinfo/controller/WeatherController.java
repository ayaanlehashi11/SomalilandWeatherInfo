package com.ayaanle.somalilandweatherinfo.controller;



import com.ayaanle.somalilandweatherinfo.util.Utils;
import com.ayaanle.somalilandweatherinfo.model.WeatherModel;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class WeatherController implements Initializable {
    public ImageView nasa_image;
    @FXML public Label label1 = new Label();
    public Label label3 = new Label();
    public Label label2 =  new Label();
    public String url = "https://api.weatherapi.com/v1/current.json?key=9ea1d4789e9e4883aec81714232112&q=hargeisa&aqi=yes";
    public Button button1;
    public WeatherModel wm = new WeatherModel();
    @FXML
    public ImageView img1, img2 , img3 , img4;
    @FXML
    private Label welcomeText;

    Image image1 = new Image("asset/rainy-1.svg");
    Image image2 , image3 , image4;
    @FXML
    private ComboBox<Utils.City> combo;

    @FXML
    private ImageView img_view;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        img1.setImage(image1);
        assert combo != null : "fx:id=\"combo\"was not injected check your fxml file";
        combo.getItems().setAll(Utils.City.Hargeisa ,
                Utils.City.Berbera, Utils.City.Borama,
                Utils.City.Ainabo, Utils.City.Gabilay,
                Utils.City.Saylac, Utils.City.Odweyne);;

        combo.getSelectionModel().selectedItemProperty()
                .addListener(new ChangeListener<Utils.City>() {
                    @Override
                    public void changed(ObservableValue<? extends Utils.City> observableValue,
                                        Utils.City city, Utils.City t1)
                       {
                           wm.filterCity(city);
                           label1.setText(String.valueOf(wm.getTemp()));
                           label2.setText(String.valueOf(wm.getPressure()));
                           label3.setText(String.valueOf(wm.getHumidity()));
                       }
                });
        combo.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                label1.setText(String.valueOf(wm.getWindSpeed()));
            }
        });
    };
}