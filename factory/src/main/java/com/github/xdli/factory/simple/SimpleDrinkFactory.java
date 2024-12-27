package com.github.xdli.factory.simple;

public class SimpleDrinkFactory {
    public static Drink createDrink(String type) {
        switch (type) {
            case "coffee":
                return new Coffee();
            case "tea":
                return new Tea();
            default:
                throw new IllegalArgumentException("未知饮料类型");
        }
    }
} 