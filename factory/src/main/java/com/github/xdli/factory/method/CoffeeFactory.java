package com.github.xdli.factory.method;

import com.github.xdli.factory.simple.Coffee;
import com.github.xdli.factory.simple.Drink;

public class CoffeeFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new Coffee();
    }
} 