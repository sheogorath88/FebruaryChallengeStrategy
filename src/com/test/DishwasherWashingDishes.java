package com.test;

public class DishwasherWashingDishes implements WashDishes{

    @Override
    public void washDishes(DirtyDishes dirtyDishes) {
        System.out.println(dirtyDishes.toString() + " will be washed by dishwasher");
    }
}
