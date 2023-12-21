package com.ayaanle.somalilandweatherinfo;


public class WeatherParams {
    int avg_temp , min_temp ,  max_temp;
    int precipitation;
    int humidity;
    int pressure;
    int wind_speed ,  wind_angle;

    String wind_direction;

    int uv_intensity;

    int clouds;



    enum AIR_QUALITY
    {
        // carbon monoxide in the air
        CO,
        NO2,
        O3 , // amount of ozone in the air
    }

}
