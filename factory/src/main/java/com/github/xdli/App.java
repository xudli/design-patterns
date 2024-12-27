package com.github.xdli;

import com.github.xdli.factory.simple.Drink;
import com.github.xdli.factory.simple.SimpleDrinkFactory;
import com.github.xdli.factory.method.CoffeeFactory;
import com.github.xdli.factory.method.TeaFactory;
import com.github.xdli.factory.abstract_factory.CafeFactory;
import com.github.xdli.factory.abstract_factory.TeaHouseFactory;
import com.github.xdli.factory.abstract_factory.RestaurantFactory;

public class App {
    public static void main(String[] args) {
        // 1. 测试简单工厂
        System.out.println("===简单工厂模式===");
        Drink coffee = SimpleDrinkFactory.createDrink("coffee");
        coffee.make();
        Drink tea = SimpleDrinkFactory.createDrink("tea");
        tea.make();

        // 2. 测试工厂方法
        System.out.println("\n===工厂方法模式===");
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        TeaFactory teaFactory = new TeaFactory();
        
        Drink coffee2 = coffeeFactory.createDrink();
        coffee2.make();
        Drink tea2 = teaFactory.createDrink();
        tea2.make();

        // 3. 测试抽象工厂
        System.out.println("\n===抽象工厂模式===");
        RestaurantFactory cafe = new CafeFactory();
        RestaurantFactory teaHouse = new TeaHouseFactory();

        Drink cafeDrink = cafe.createDrink();
        cafeDrink.make();
        cafe.createFood().prepare();

        Drink teaHouseDrink = teaHouse.createDrink();
        teaHouseDrink.make();
        teaHouse.createFood().prepare();
    }
}
