package com.ayaanle.somalilandweatherinfo.intrfc;

public interface WeatherParamsInterface {
    double getTemp();
    double getPressure();
    double getWindSpeed();
    double getWindAngle();
    String getWindDirection();

    int getPrecipitation();
    int getHumidity();
    int getAirQuality();
    int getUVIntensity();
    int getClouds();
}
