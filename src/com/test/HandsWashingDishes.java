package com.test;

public class HandsWashingDishes implements WashDishes{

    @Override
    public void washDishes() {
        System.out.println("the dishwasher is broken so today we wash the dishes by hand");

    }
}
