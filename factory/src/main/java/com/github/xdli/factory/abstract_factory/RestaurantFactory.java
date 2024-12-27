package com.github.xdli.factory.abstract_factory;

import com.github.xdli.factory.simple.Drink;

public interface RestaurantFactory {
    Drink createDrink();
    Food createFood();
} 