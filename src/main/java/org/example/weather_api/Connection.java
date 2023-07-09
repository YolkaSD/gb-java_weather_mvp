package org.example.weather_api;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {
    //b9f9afb6cda71f1ddc3341a9a54fc332
    private static final String APIKEY = "b9f9afb6cda71f1ddc3341a9a54fc332";

    public String getJson(String city) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();

        //http://api.weatherstack.com/current?access_key=b9f9afb6cda71f1ddc3341a9a54fc332&query=city
        URL url = new URL("http://api.weatherstack.com/current?access_key=" + APIKEY + "&query=" + city);
        URLConnection connection = url.openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }

        System.out.println(stringBuilder);
        return stringBuilder.toString();

    }

}
