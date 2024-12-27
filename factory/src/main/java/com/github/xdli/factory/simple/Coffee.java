package com.github.xdli.factory.simple;

public class Coffee implements Drink {
    @Override
    public void make() {
        System.out.println("制作咖啡");
    }
} 