package com.company.factory;

import com.company.dao.BetDao;
import com.company.dao.BetDaoImpl;

public class BetDaoFactory {
    private static BetDao instance;

    public static BetDao getBetDao() {
        if (instance == null) {
            instance = new BetDaoImpl();
        }
        return instance;
    }
}
