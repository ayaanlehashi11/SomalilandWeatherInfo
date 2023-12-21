package com.ayaanle.somalilandweatherinfo;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherInfo {
    String input;
    @SuppressWarnings("CallToPrintStackTrace")
    public String dataScrapper(String url)
    {
        String weather_data =  "";
        try {
            final URL Url = new URL(url);
            final HttpsURLConnection con = (HttpsURLConnection) Url.openConnection();
            System.out.println("****** Content of the URL ********");
            final BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while ((input = br.readLine()) != null) {
                System.out.println(input);
                weather_data += input;
                }
            System.out.println(weather_data);
            br.close();
            } catch(MalformedURLException me)
            {
                me.printStackTrace();
            }
        catch(IOException e){
                e.printStackTrace();
            }
        return weather_data;
    }
}
