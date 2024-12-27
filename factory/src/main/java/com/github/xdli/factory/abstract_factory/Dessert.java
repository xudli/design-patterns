package com.github.xdli.factory.abstract_factory;

public class Dessert implements Food {
    @Override
    public void prepare() {
        System.out.println("准备甜点");
    }
} 