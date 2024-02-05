package com.ayaanle.somalilandweatherinfo.intrfc;

public interface ExportData {
    public String export2Json(String filename);

    public String export2CSV(String filename);
}
