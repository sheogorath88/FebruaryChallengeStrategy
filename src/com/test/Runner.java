package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {

    public static void main(String[] args) {

        Washer diswasher = new Washer(new DishwasherWashingDishes());
        Washer handwash = new Washer(new HandsWashingDishes());
        Washer husband = new Washer(new HusbandWashingDishes());

        List<Washer> options = new ArrayList<>();
        options.add(diswasher);
        options.add(handwash);
        options.add(husband);

        int range = options.size()-1;

        Random random = new Random();

        int happyWasher = (int)Math.round(Math.random()*range);

        options.get(happyWasher).wash();
    }
}
