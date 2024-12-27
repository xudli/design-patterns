package com.github.xdli.factory.abstract_factory;

import com.github.xdli.factory.simple.Drink;
import com.github.xdli.factory.simple.Tea;

public class TeaHouseFactory implements RestaurantFactory {
    @Override
    public Drink createDrink() {
        return new Tea();
    }

    @Override
    public Food createFood() {
        return new Snack();
    }
} 