package com.test;

public class DirtyDishes {
    private Name name;
    private Stock stock;

    private DirtyDishes(DirtyDishesBuilder dirtyDishesBuilder){
        this.name = dirtyDishesBuilder.name;
        this.stock = dirtyDishesBuilder.stock;
    }

    @Override
    public String toString() {
        return "Dirty dish (" + name + " " + stock+ ")";
    }

    public static class DirtyDishesBuilder{
        private Name name;
        private Stock stock;

        public DirtyDishesBuilder name(Name name) {
            this.name = name;
            return this;
        }

        public DirtyDishesBuilder stock(Stock stock) {
            this.stock = stock;
            return this;
        }

        public DirtyDishes build(){
            return new DirtyDishes(this);
        }
    }
}
