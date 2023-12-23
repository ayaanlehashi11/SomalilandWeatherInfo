package com.ayaanle.somalilandweatherinfo;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
public class WeatherData {
    String input;
    @SuppressWarnings("CallToPrintStackTrace")
    public String dataScrapper(String url)
    {
        StringBuilder weather_data = new StringBuilder();
        try {
            final URL Url = new URL(url);
            final HttpsURLConnection con = (HttpsURLConnection) Url.openConnection();
            System.out.format("Response code : %d " , con.getResponseCode());
            System.out.format("Response Message %s" , con.getResponseMessage());
            final BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while ((input = br.readLine()) != null) {
                    System.out.println(input);
                    weather_data.append(input);
            }
            System.out.println(weather_data);
            br.close();
            }
        catch(MalformedURLException me)
            {
                me.printStackTrace();
            }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return weather_data.toString();
    }

}
