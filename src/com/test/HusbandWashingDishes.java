package com.test;

public class HusbandWashingDishes implements WashDishes {

    @Override
    public void washDishes(DirtyDishes dirtyDishes) {
        System.out.println(dirtyDishes.toString() + " will be washed by my husband :)))) ");
    }
}
