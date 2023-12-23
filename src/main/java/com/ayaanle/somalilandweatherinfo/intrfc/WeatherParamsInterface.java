package com.ayaanle.somalilandweatherinfo.intrfc;

public interface WeatherParamsInterface {
    int [] getTemp();
    int getPressure();
    int getWindSpeed();
    int getWindAngle();
    String getWindDirection();

    int getPrecipitation();
    int getHumidity();
    int getAirQuality();
    int getUVIntensity();
    int getClouds();
}
