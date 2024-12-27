package com.github.xdli.factory.method;

import com.github.xdli.factory.simple.Drink;
import com.github.xdli.factory.simple.Tea;

public class TeaFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new Tea();
    }
} 