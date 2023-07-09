package org.example.ui;

import org.example.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
    }

    @Override
    public void start() {
        while (true) {
            String city = scan();
            presenter.getInfo(city);
        }
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    private String scan() {
        System.out.println("Введите название города");
        return scanner.next();
    }
}
