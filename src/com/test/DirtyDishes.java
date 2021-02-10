package com.test;

public class DirtyDishes {
    private Name name;
    private Stock stock;
    private WashDishes washDishes;

    public DirtyDishes(Name name, Stock stock, WashDishes washDishes) {
        this.name = name;
        this.stock = stock;
        this.washDishes = washDishes;
    }

    public Name getName() {
        return name;
    }

    public Stock getStock() {
        return stock;
    }

    public void startWashing(){
        System.out.println(this.name.getName() + " is made of " + this.stock.getStock() + " and ");
        washDishes.washDishes();
}

    @Override
    public String toString() {
        return this.name +
                "is made of " + this.stock +
                " and " + this.washDishes;
    }
}
