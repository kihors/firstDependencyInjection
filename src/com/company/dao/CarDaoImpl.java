package com.company.dao;

import com.company.db.Storage;
import com.company.lib.Dao;
import com.company.model.Car;

import java.util.List;

@Dao
public class CarDaoImpl implements CarDao {
    @Override
    public void addCar(Car car) {
        Storage.CARS.add(car);
    }

    @Override
    public List<Car> getAllCar() {
        return Storage.CARS;
    }
}
