package com.test;

import java.util.List;

public class Washer {
    private WashDishes washDishes;
    private List<DirtyDishes> dirtyDishes;

    public Washer(WasherBuilder washerBuilder) {
        this.washDishes = washerBuilder.washDishes;
        this.dirtyDishes = washerBuilder.dirtyDishes;
    }

    public void turnOnDishwash(){
        for(int i = 0; i < dirtyDishes.size()-1; i++){
            System.out.println("Washer is washing dirty dish nr " + i);
            washDishes.washDishes(dirtyDishes.get(i));
        }
    }

    public static class WasherBuilder{
        private WashDishes washDishes;
        private List<DirtyDishes> dirtyDishes;

        public WasherBuilder washDishes(WashDishes washDishes) {
            this.washDishes = washDishes;
            return this;
        }

        public WasherBuilder dirtyDishes(List<DirtyDishes> dirtyDishes) {
            this.dirtyDishes = dirtyDishes;
            return this;
        }

        public Washer build(){
            return new Washer(this);
        }
    }
}
