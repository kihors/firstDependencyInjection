package com.company;

import com.company.controller.ConsoleHandler;
import com.company.dao.BetDao;
import com.company.dao.BetDaoImpl;
import com.company.dao.CarDao;
import com.company.dao.CarDaoImpl;
import com.company.lib.Injector;

public class Main {
    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("To make a bet you need to \n" +
                "enter the amount, space and the risk, \n" +
                "or enter 0 for to exit");
        ConsoleHandler.handleBet();
        BetDao betDao = new BetDaoImpl();
        System.out.println(betDao.getAllBet());

        System.out.println("To add a car you need to \n" +
                "enter the name, space, and the power, \n" +
                "or enter 0 for to exit");
        ConsoleHandler.handleCar();
        CarDao carDao = new CarDaoImpl();
        System.out.println(carDao.getAllCar());
    }
}
