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

//        int happyWasher = (int) Math.round(Math.random() * range);

//        options.get(happyWasher).wash();

        DirtyDishes plate1 = new DirtyDishes(new Name("glass plate"), new Stock("glass"), new DishwasherWashingDishes());
        DirtyDishes plate2 = new DirtyDishes(new Name("ceramic plate"), new Stock("ceramic"), new DishwasherWashingDishes());
        DirtyDishes plate3 = new DirtyDishes(new Name("plastic plate"), new Stock("plastic"), new DishwasherWashingDishes());
        DirtyDishes plate4 = new DirtyDishes(new Name("wood plate"), new Stock("wood"), new HandsWashingDishes());
        DirtyDishes glass1 = new DirtyDishes(new Name("glass with flamingos"), new Stock("pink glass"), new HandsWashingDishes());
        DirtyDishes glass2 = new DirtyDishes(new Name("glass with flowers"), new Stock("black glass"), new HandsWashingDishes());
        DirtyDishes pot1 = new DirtyDishes(new Name("pan"), new Stock("steel"), new HusbandWashingDishes());
        DirtyDishes fryingPan1 = new DirtyDishes(new Name("frying pan"), new Stock("teflon"), new HusbandWashingDishes());
        DirtyDishes colander1 = new DirtyDishes(new Name("colander"), new Stock("steel"), new HusbandWashingDishes());
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
        dirtyDishes.add(pot1);
        dirtyDishes.add(fryingPan1);
        dirtyDishes.add(colander1);
        dirtyDishes.add(foodContainer1);
        dirtyDishes.add(foodContainer2);
        dirtyDishes.add(foodContainer3);
        dirtyDishes.add(foodContainer4);
        dirtyDishes.add(cutlery1);
        dirtyDishes.add(cutlery2);
        dirtyDishes.add(cutlery3);

//        Washer turnOn = new Washer(dirtyDishes);
//        turnOn.turnOnDishwash();


        Name plate = new Name("plate");
        Name glassName = new Name("glass");
        Name pot = new Name("pot");
        Name fryingPan = new Name("frying pan");
        Name colander = new Name("colander");
        Name foodContainer = new Name("container");
        Name cutlery = new Name("cutlery");

        List<Name> nameList = new ArrayList<>();
            nameList.add(plate);
            nameList.add(glassName);
            nameList.add(pot);
            nameList.add(fryingPan);
            nameList.add(colander);
            nameList.add(foodContainer);
            nameList.add(cutlery);

        Stock glassStock = new Stock("glass");
        Stock plastic = new Stock("plastic");
        Stock ceramic = new Stock("ceramic");
        Stock teflon = new Stock("teflon");
        Stock wood = new Stock("wood");
        Stock steel = new Stock("steel");

        List<Stock> stockList = new ArrayList<>();
            stockList.add(glassStock);
            stockList.add(plastic);
            stockList.add(ceramic);
            stockList.add(teflon);
            stockList.add(wood);
            stockList.add(steel);

        WashDishes washDishes = new DishwasherWashingDishes();
        WashDishes handWashing = new HandsWashingDishes();
        WashDishes husbandWashing = new HusbandWashingDishes();

        List<WashDishes> washDishesList = new ArrayList<>();
            washDishesList.add(washDishes);
            washDishesList.add(handWashing);
            washDishesList.add(husbandWashing);

        int sizeNameList = nameList.size()-1;
        int sizeStockList = stockList.size()-1;
        int sizeWashDishesList = washDishesList.size()-1;

        int randomlyName = (int) Math.round(Math.random()*sizeNameList);
        int randomlyStock = (int) Math.round(Math.random()* sizeStockList);
        int randomlyWashDishes = (int) Math.round(Math.random()*sizeWashDishesList);


            List<DirtyDishes> dirtyDishesRandom = new ArrayList<>();
            for(int i = 0; i <= 10; i++){
                dirtyDishesRandom.add(i, new DirtyDishes((nameList.get(randomlyName)), stockList.get(randomlyStock), washDishesList.get(randomlyWashDishes)));
                System.out.println(dirtyDishesRandom.get(i).toString());
            }

    }
}
