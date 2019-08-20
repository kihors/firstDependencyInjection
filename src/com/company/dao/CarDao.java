package com.company.dao;

import com.company.model.Car;

import java.util.List;

public interface CarDao {
    void addCar(Car car);

    List<Car> getAllCar();
}
