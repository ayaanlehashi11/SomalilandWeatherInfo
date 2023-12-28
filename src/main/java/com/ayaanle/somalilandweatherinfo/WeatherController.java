package com.ayaanle.somalilandweatherinfo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class WeatherController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private ComboBox<City> combo;

    @FXML
    private ImageView img_view;
    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        assert combo != null : "fx:id=\"combo\"was not injected check your fxml file";
        combo.getItems().setAll(City.Hargeisa , City.Berbera , City.Borama);
        combo.getSelectionModel().selectedItemProperty()
                .addListener(new ChangeListener<City>() {
                    @Override
                    public void changed(ObservableValue<? extends City> observableValue,
                                        City city, City t1)
                       {
                        System.out.println("the city that you have selected is " + combo.getValue().toString());
                    }
                });
    }
}