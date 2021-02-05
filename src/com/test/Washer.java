package com.test;

import java.util.List;

public class Washer {
    private WashDishes washDishes;
    private List<DirtyDishes> dirtyDishes;

    public Washer(List<DirtyDishes> dirtyDishes) {
        this.dirtyDishes = dirtyDishes;
    }

    public Washer(WashDishes washDishes) {
        this.washDishes = washDishes;
    }

    public void wash(){
        washDishes.washDishes();
    }

    public void turnOnDishwash(){
        for(int i = 0; i < dirtyDishes.size()-1; i++){
            dirtyDishes.get(i).startWashing();
        }
    }
}
