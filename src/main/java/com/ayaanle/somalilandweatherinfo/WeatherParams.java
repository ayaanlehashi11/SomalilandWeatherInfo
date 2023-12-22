package com.ayaanle.somalilandweatherinfo;


public class WeatherParams implements WeatherParamsInterface , UtilsInterface{
    int avg_temp , min_temp ,  max_temp;
    int precipitation;
    int humidity;
    int pressure;
    int wind_speed ,  wind_angle;
    String wind_direction;
    int uv_intensity;
    int clouds;
    @Override
    public int[] getTemp() {
        avg_temp = 0;
        min_temp = 0;
        max_temp = 0;

        int[] temp;
        temp = new int[]{avg_temp, max_temp, min_temp};
        return temp;
    }

    @Override
    public int getPressure() {
        return pressure;
    }

    @Override
    public int getWindSpeed() {
        return wind_speed;
    }

    @Override
    public int getWindAngle() {
        return wind_angle;
    }

    @Override
    public String getWindDirection() {
        return wind_direction;
    }

    @Override
    public int getPrecipitation() {
        return precipitation;
    }

    @Override
    public int getHumidity() {
        return humidity;
    }

    @Override
    public String getCity() {
        return null;
    }

    @Override
    public String getRegion() {
        return null;
    }

    @Override
    public String getCoordinates() {
        return null;
    }


    enum AIR_QUALITY
    {
        // carbon monoxide in the air
        CO,
        NO2,
        O3 , // amount of ozone in the air
    }
    @Override
    public int getAirQuality()
    {
        AIR_QUALITY airQuality;
        return 0;
    }

    @Override
    public int getUVIntensity() {
        return 0;
    }

    @Override
    public int getClouds() {
        return 0;
    }
}
