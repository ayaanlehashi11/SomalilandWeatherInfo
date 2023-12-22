package com.ayaanle.somalilandweatherinfo;

public interface UtilsInterface {
    public String getCity();
    public String getRegion();

    public String getCoordinates();

}

interface ExportData
{
    public String export2Json();
    public String export2CSV();
}

