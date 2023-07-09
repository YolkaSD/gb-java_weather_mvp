package org.example.weather_api;

import org.example.weather_api.weather.Weather;

import java.io.IOException;

public class WeatherService implements Service {
    private Connection connection;
    private Formatter formatter;

    private static final String EMPTY_ERROR = "Вы не ввели город";
    private static final String CITY_ERROR = "Не верное название  города";

    public WeatherService() {
        connection = new Connection();
        formatter = new Formatter();
    }

    @Override
    public String get(String city) {
        if (city.equals("")) {
            return EMPTY_ERROR;
        }

        try {
            String info = connection.getJson(city);
            Weather weather = formatter.parse(info);
            return weather.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
            e.printStackTrace();
            return CITY_ERROR;
        }

    }
}
