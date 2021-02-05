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

        int range = options.size() - 1;

        Random random = new Random();

        int happyWasher = (int) Math.round(Math.random() * range);

//        options.get(happyWasher).wash();

        DirtyDishes plate1 = new DirtyDishes(new Name("glass plate"), new Stock("glass"), new DishwasherWashingDishes());
        DirtyDishes plate2 = new DirtyDishes(new Name("ceramic plate"), new Stock("ceramic"), new DishwasherWashingDishes());
        DirtyDishes plate3 = new DirtyDishes(new Name("plastic plate"), new Stock("plastic"), new DishwasherWashingDishes());
        DirtyDishes plate4 = new DirtyDishes(new Name("wood plate"), new Stock("wood"), new HandsWashingDishes());
        DirtyDishes glass1 = new DirtyDishes(new Name("glass with flamingos"), new Stock("pink glass"), new HandsWashingDishes());
        DirtyDishes glass2 = new DirtyDishes(new Name("glass with flowers"), new Stock("black glass"), new HandsWashingDishes());
        DirtyDishes pot = new DirtyDishes(new Name("pan"), new Stock("steel"), new HusbandWashingDishes());
        DirtyDishes fryingPan = new DirtyDishes(new Name("frying pan"), new Stock("teflon"), new HusbandWashingDishes());
        DirtyDishes colander = new DirtyDishes(new Name("colander"), new Stock("steel"), new HusbandWashingDishes());
        DirtyDishes foodContainer1 = new DirtyDishes(new Name("green food container"), new Stock("plastic"), new HusbandWashingDishes());
        DirtyDishes foodContainer2 = new DirtyDishes(new Name("blue food container"), new Stock("plastic"), new HandsWashingDishes());
        DirtyDishes foodContainer3 = new DirtyDishes(new Name("green food container"), new Stock("plastic"), new HandsWashingDishes());
        DirtyDishes foodContainer4 = new DirtyDishes(new Name("white food container"), new Stock("plastic"), new DishwasherWashingDishes());
        DirtyDishes cutlery1 = new DirtyDishes(new Name("spoon"), new Stock("steel"), new DishwasherWashingDishes());
        DirtyDishes cutlery2 = new DirtyDishes(new Name("fork"), new Stock("steel"), new HusbandWashingDishes());
        DirtyDishes cutlery3 = new DirtyDishes(new Name("knife"), new Stock("steel"), new HandsWashingDishes());


        List<DirtyDishes> dirtyDishes = new ArrayList<>();
        dirtyDishes.add(plate1);
        dirtyDishes.add(plate2);
        dirtyDishes.add(plate3);
        dirtyDishes.add(plate4);
        dirtyDishes.add(glass1);
        dirtyDishes.add(glass2);
        dirtyDishes.add(pot);
        dirtyDishes.add(fryingPan);
        dirtyDishes.add(colander);
        dirtyDishes.add(foodContainer1);
        dirtyDishes.add(foodContainer2);
        dirtyDishes.add(foodContainer3);
        dirtyDishes.add(foodContainer4);
        dirtyDishes.add(cutlery1);
        dirtyDishes.add(cutlery2);
        dirtyDishes.add(cutlery3);

        Washer turnOn = new Washer(dirtyDishes);
        turnOn.turnOnDishwash();
    }
}
