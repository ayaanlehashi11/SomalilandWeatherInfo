package com.ayaanle.somalilandweatherinfo;

public interface WeatherParamsInterface {
    public int [] getTemp();
    public int getPressure();
    public int getWindSpeed();

    public int getWindAngle();
    public String getWindDirection();

    public int getPrecipitation();
    public int getHumidity();
    public int getAirQuality();
    public int getUVIntensity();
    public int getClouds();
}
