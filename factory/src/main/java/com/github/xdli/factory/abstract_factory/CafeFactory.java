package com.github.xdli.factory.abstract_factory;

import com.github.xdli.factory.simple.Drink;
import com.github.xdli.factory.simple.Coffee;

public class CafeFactory implements RestaurantFactory {
    @Override
    public Drink createDrink() {
        return new Coffee();
    }

    @Override
    public Food createFood() {
        return new Dessert();
    }
} 