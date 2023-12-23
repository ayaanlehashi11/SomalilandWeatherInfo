package com.ayaanle.somalilandweatherinfo;

import com.ayaanle.somalilandweatherinfo.intrfc.ExportData;
import com.ayaanle.somalilandweatherinfo.intrfc.UtilsInterface;

public abstract class Utils implements ExportData, UtilsInterface {
    String city_name;

    @Override
    public String export2Json()
    {

        return null;
    }

    @Override
    public String export2CSV() {
        return null;
    }

    public void setCity(City city)
    {
        switch(city)
        {
            case Hargeisa ->
            {
                city_name = "hargeisa";
            }
            case Gabilay ->
            {

            }
            case Burao ->
            {

            }
            case Odweyne ->
            {

            }
            case Borama ->
            {

            }
            case Baki ->
            {

            }
            case Saylac ->
            {

            }
            case Lasanod ->
            {

            }
            case Ainabo ->
            {

            }
            case Taleh ->
            {

            }
            case Erigavo ->
            {

            }
            case Laskoray ->
            {

            }
            case Berbera ->
            {

            }
            case Sheikh ->
            {

            }
        }
    }

    @Override
    public abstract String getCoordinates();
}
enum City
{
    //marodijeh
    Hargeisa, Gabilay,
    // Togdher
    Burao, Odweyne,

    // Awdal
    Borama, Baki, Saylac,
    //Sool
    Lasanod, Ainabo, Taleh,

    //Sanaag

    Erigavo , Laskoray,
    // Sahil Region
    Berbera, Sheikh,
}
