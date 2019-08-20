package com.company.lib;

import com.company.controller.ConsoleHandler;
import com.company.dao.BetDaoImpl;
import com.company.dao.CarDaoImpl;
import com.company.factory.BetDaoFactory;
import com.company.factory.CarDaoFactory;

import java.lang.reflect.Field;

public class Injector {
    public static void injectDependency() throws IllegalAccessException {
        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDaoImpl> betDaoClass = BetDaoImpl.class;
        Class<CarDaoImpl> carDaoClass = CarDaoImpl.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                if (field.getGenericType().equals(betDaoClass.getGenericInterfaces()[0])
                        && betDaoClass.isAnnotationPresent(Dao.class)) {
                    field.setAccessible(true);
                    field.set(null, BetDaoFactory.getBetDao());
                } else if (field.getGenericType().equals(carDaoClass.getGenericInterfaces()[0])
                        && carDaoClass.isAnnotationPresent(Dao.class)) {
                    field.setAccessible(true);
                    field.set(null, CarDaoFactory.getCarDao());
                }
            }
        }
    }
}
