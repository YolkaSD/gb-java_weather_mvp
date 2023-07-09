package org.example.weather_api;

import com.google.gson.Gson;
import org.example.weather_api.weather.Weather;

public class Formatter {

    public Weather parse(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Weather.class);
    }
}
