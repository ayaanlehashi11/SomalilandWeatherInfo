package com.ayaanle.somalilandweatherinfo;


import com.ayaanle.somalilandweatherinfo.intrfc.UtilsInterface;
import com.ayaanle.somalilandweatherinfo.intrfc.WeatherParamsInterface;
import org.json.JSONObject;


public class WeatherParams implements WeatherParamsInterface, UtilsInterface {

    String API_KEY = "yourapikey";
    double  latitude ,longtitude;
    String url = "https://api.weatherapi.com/v1/current.json?key="+ API_KEY+"&q=hargeisa&aqi=yes";
    WeatherData wi = new WeatherData();
    //System.out.println(wi.dataScrapper(url));
    JSONObject jsonObject = wi.getParams(wi.dataScrapper(url));
    /*public String avg_temp()
    {
        WeatherParams wp = new WeatherParams();
        Gson gson = new Gson();
        gson.fromJson();
        JsonArray ja = new JsonArray();
        return "";
    }*/
    WeatherData wd = new WeatherData();
    int precipitation;
    int humidity;
    public double pressure = jsonObject.getJSONObject("current").getDouble("pressure_in");
    int wind_speed ,  wind_angle;
    String wind_direction;
    int uv_intensity;
    int clouds;
    @Override
    public int[] getTemp() {
        return new int[]{0};
    }
    @Override
    public double getPressure() {
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

    enum Condition
    {
        Sunny,
        Rainy,
        Cloudy,
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
