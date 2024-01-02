package com.ayaanle.somalilandweatherinfo;


import com.ayaanle.somalilandweatherinfo.intrfc.UtilsInterface;
import com.ayaanle.somalilandweatherinfo.intrfc.WeatherParamsInterface;
import org.json.JSONObject;


public class WeatherParams implements WeatherParamsInterface, UtilsInterface {

    String API_KEY = "apikey";
    double  latitude ,longtitude;

    String city_name;
    public String filterCity(City city)
    {
        switch(city)
        {
            case Hargeisa ->
            {
                city_name = "hargeisa";
                return city_name;
            }
            case Gabilay ->
            {
                city_name = "Gabilay";
                return city_name;
            }
            case Burao ->
            {
                city_name = "Burao";
                return city_name;
            }
            case Odweyne ->
            {
                city_name = "Odweyne";
                return city_name;
            }
            case Borama ->
            {
                city_name = "Borama";
                return city_name;
            }
            case Baki ->
            {
                city_name = "Baki";
                return city_name;
            }
            case Saylac ->
            {
                city_name = "Saylac";
                return city_name;
            }
            case Lasanod ->
            {
                city_name = "lasanod";
                return city_name;
            }
            case Ainabo ->
            {
                city_name = "ainabo";
                return city_name;
            }
            case Taleh ->
            {
                city_name = "taleh";
                return city_name;
            }
            case Erigavo ->
            {
                city_name = "erigavo";
                return city_name;
            }
            case Laskoray ->
            {
                city_name = "laskoray";
                return city_name;
            }
            case Berbera ->
            {
                city_name = "berbera";
                return city_name;
            }
            case Sheikh ->
            {
                city_name = "sheikh";
                return city_name;
            }
        }
        return "hargeisa";
    }
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
    int humidity = jsonObject.getJSONObject("current")
            .getInt("humidity");
    double temperature = jsonObject.getJSONObject("current")
            .getDouble("temp_c");
    public double pressure = jsonObject.getJSONObject("current")
            .getDouble("pressure_in");
    double wind_speed = jsonObject.getJSONObject("current")
            .getDouble("wind_kph");
    double wind_angle = jsonObject.getJSONObject("current")
            .getDouble("wind_degree");
    String wind_direction = jsonObject.getJSONObject("current")
            .getString("wind_dir");
    int uv_intensity;
    int clouds;
    @Override
    public double getTemp() {

        return temperature ;
    }
    @Override
    public double getPressure() {
        return pressure;
    }
    @Override
    public double getWindSpeed() {
        return wind_speed;
    }

    @Override
    public double getWindAngle() {
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
    public int getHumidity()
    {
        return humidity;
    }

    @Override
    public String getCity() {
        return jsonObject.getJSONObject("location")
                .getString("city");
    }


    @Override
    public String getCoordinates() {
        longtitude =  jsonObject.getJSONObject("location")
                .getDouble("lon");
        latitude = jsonObject.getJSONObject("location")
                .getDouble("lat");
        return "lat: " + latitude + " long: " + longtitude;
    }

    public void print_location()
    {
        System.out.println("magaalada : " + jsonObject.getJSONObject("location")
                .getString("name") + "\n" +
                "latitude: " + jsonObject.getJSONObject("location")
                        .getDouble("lat") + "\n" +
                "longtitude : " + jsonObject.getJSONObject("location")
                        .getDouble("lon")
                + "\n" +
                "localtime : " + jsonObject.getJSONObject("location")
                        .getString("localtime")
        );
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
        return uv_intensity;
    }

    @Override
    public int getClouds() {
        return clouds;
    }
}
