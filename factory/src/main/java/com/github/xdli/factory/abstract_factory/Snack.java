package com.github.xdli.factory.abstract_factory;

public class Snack implements Food {
    @Override
    public void prepare() {
        System.out.println("准备小吃");
    }
} 