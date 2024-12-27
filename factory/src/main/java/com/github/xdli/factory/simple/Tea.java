package com.github.xdli.factory.simple;

public class Tea implements Drink {
    @Override
    public void make() {
        System.out.println("制作茶");
    }
} 