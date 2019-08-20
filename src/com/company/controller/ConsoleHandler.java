package com.company.controller;

import com.company.dao.BetDao;
import com.company.dao.CarDao;
import com.company.lib.Inject;
import com.company.model.Bet;
import com.company.model.Car;

import java.util.Scanner;

public class ConsoleHandler {

    @Inject
    private static BetDao betDao;
    @Inject
    private static CarDao carDao;

    private static Scanner scanner = new Scanner(System.in);

    public static void handleBet() {
        try {
            while (true) {
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    return;
                }
                String[] data = command.split(" ");
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                Bet bet = new Bet(value, risk);
                betDao.addBet(bet);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Data entered incorrectly");
        }
    }

    public static void handleCar() {
        try {
            while (true) {
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    return;
                }
                String[] data = command.split(" ");
                String name = data[0];
                int power = Integer.parseInt(data[1]);
                Car car = new Car(name, power);
                carDao.addCar(car);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Data entered incorrectly");
        }
    }
}
