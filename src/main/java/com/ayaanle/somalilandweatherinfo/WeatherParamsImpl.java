package com.ayaanle.somalilandweatherinfo;

import java.util.List;

public interface WeatherParamsImpl {
    public List<String> getWeatherParams(WeatherParams wp , List<String>params);
}
interface UtilsImpl
{
    public void setCity();
    public String getCity();
}
