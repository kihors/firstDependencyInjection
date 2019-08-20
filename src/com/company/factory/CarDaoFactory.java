package com.company.factory;

import com.company.dao.CarDao;
import com.company.dao.CarDaoImpl;

public class CarDaoFactory {
    private static CarDao instance;

    public static CarDao getCarDao() {
        if (instance == null) {
            instance = new CarDaoImpl();
        }
        return instance;
    }
}
