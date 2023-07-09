package org.example;

import org.example.ui.ConsoleUI;
import org.example.ui.View;
import org.example.weather_api.Connection;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();

    }
}