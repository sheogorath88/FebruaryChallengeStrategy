package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Runner {

    public static void main(String[] args) {

        List<String> possiblePlatesNames = Arrays.asList(
            "glass plate",
            "ceramic plate",
            "plastic plate",
            "wood plate");

        List<String> possibleGlassNames = Arrays.asList(
            "glass with flamings",
            "glass with flowers"
        );

        List<String> possibleFoodContainerNames = Arrays.asList(
            "green food container",
            "blue food container",
            "white food container"
        );

        List<String> possibleCutleryNames = Arrays.asList(
            "spoon",
            "fork",
            "knife"
        );

        List<String> possibleStockNames = Arrays.asList(
            "glass",
            "ceramic",
            "plastic",
            "wood"
        );

        List<WashDishes> possibleWashDishes = new ArrayList<>();
        possibleWashDishes.add(new DishwasherWashingDishes());
        possibleWashDishes.add(new HandsWashingDishes());
        possibleWashDishes.add(new HusbandWashingDishes());
        int possibleWashDishesSize = possibleWashDishes.size();

        List<DirtyDishes> dirtyDishes = new ArrayList<>();
        for (int i = 0; i < 16; i++){
            if ( i % 4 == 0) {
                DirtyDishes dish = createDirtyDish(possibleCutleryNames, possibleStockNames);
                dirtyDishes.add(dish);
            } else if ( i % 4 == 1){
              DirtyDishes dish = createDirtyDish(possiblePlatesNames, possibleStockNames);
              dirtyDishes.add(dish);
            } else if ( i % 4 == 2){
              DirtyDishes dish = createDirtyDish(possibleGlassNames, possibleStockNames);
              dirtyDishes.add(dish);
            } else {
              DirtyDishes dish = createDirtyDish(possibleFoodContainerNames, possibleStockNames);
              dirtyDishes.add(dish);
            }
        }

        Random random = new Random();
        List<Washer> washers = new ArrayList<>();
        int randomWashDishesIndex = random.nextInt(possibleWashDishesSize);
        washers.add(
            new Washer.WasherBuilder()
                .dirtyDishes(dirtyDishes.subList(0, 4))
                .washDishes(possibleWashDishes.get(randomWashDishesIndex))
                .build()
        );

        randomWashDishesIndex = random.nextInt(possibleWashDishesSize);
        washers.add(
            new Washer.WasherBuilder()
                .dirtyDishes(dirtyDishes.subList(4, 8))
                .washDishes(possibleWashDishes.get(randomWashDishesIndex))
                .build()
        );

        randomWashDishesIndex = random.nextInt(possibleWashDishesSize);
        washers.add(
            new Washer.WasherBuilder()
                .dirtyDishes(dirtyDishes.subList(8, 12))
                .washDishes(possibleWashDishes.get(randomWashDishesIndex))
                .build()
        );

        randomWashDishesIndex = random.nextInt(possibleWashDishesSize);
        washers.add(
            new Washer.WasherBuilder()
                .dirtyDishes(dirtyDishes.subList(12, 16))
                .washDishes(possibleWashDishes.get(randomWashDishesIndex))
                .build()
        );

      for (int i = 0 ; i < washers.size(); i++) {
        Washer washer = washers.get(i);
        washer.turnOnDishwash();
        System.out.println("\n");
      }
    }

  private static DirtyDishes createDirtyDish(
        List<String> possibleCutleryNames,
        List<String> possibleStockNames
    ) {
      Random random = new Random();
      int possibleNamesSize = possibleCutleryNames.size();
      int randomNameIndex = random.nextInt(possibleNamesSize);
      int possibleStockNamesSize = possibleStockNames.size();
      int randomStockNameIndex = random.nextInt(possibleStockNamesSize);
      DirtyDishes dirtyDish = new DirtyDishes.DirtyDishesBuilder()
            .name(new Name(possibleCutleryNames.get(randomNameIndex)))
            .stock(new Stock(possibleStockNames.get(randomStockNameIndex)))
            .build();
       return dirtyDish;
    }
}
