package com.ayaanle.somalilandweatherinfo.util;

import com.ayaanle.somalilandweatherinfo.intrfc.ExportData;

public class Utils implements ExportData {

    @Override
    public String export2Json(String filename)
    {

        return null;
    }

    @Override
    public String export2CSV(String filename) {
        return null;
    }

    public enum City
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

}

