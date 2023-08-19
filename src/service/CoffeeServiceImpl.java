package service;

import application.CoffeeMenu;
import application.CoffeeType;
import application.Order;
import application.Recipe;
import application.RecipeItem;
import domain.exceptions.InvalidCoffeeTypeException;
import domain.model.Coffee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CoffeeServiceImpl implements CoffeeService {
    private Map<CoffeeType, Recipe> recipes;
    private List<CoffeeType> coffeeTypes;

    public CoffeeServiceImpl(List<CoffeeType> coffeeTypes) {
        this.coffeeTypes = coffeeTypes;
        initRecipes();
    }

    private void initRecipes() {
        recipes = new HashMap<>();
        recipes.put(CoffeeType.ESPRESSO, new Recipe(CoffeeType.ESPRESSO, List.of(new RecipeItem("Espresso", 1))));
        recipes.put(CoffeeType.DOUBLE_ESPRESSO, new Recipe(CoffeeType.DOUBLE_ESPRESSO, List.of(new RecipeItem("Espresso", 2))));
        recipes.put(CoffeeType.AMERICANO, new Recipe(CoffeeType.AMERICANO, List.of(new RecipeItem("Espresso", 1), new RecipeItem("Hot Water", 4))));
        recipes.put(CoffeeType.CAPPUCCINO, new Recipe(CoffeeType.CAPPUCCINO, List.of(new RecipeItem("Espresso", 1), new RecipeItem("Steamed Milk", 2), new RecipeItem("Milk Foam", 2))));
        recipes.put(CoffeeType.CAFFE_LATTE, new Recipe(CoffeeType.CAFFE_LATTE, List.of(new RecipeItem("Espresso", 1), new RecipeItem("Steamed Milk", 3), new RecipeItem("Milk Foam", 1))));
        recipes.put(CoffeeType.MOCHA, new Recipe(CoffeeType.MOCHA, List.of(new RecipeItem("Espresso", 1), new RecipeItem("Steamed Milk", 1), new RecipeItem("Milk Foam", 1), new RecipeItem("Hot Chocolate", 2))));
        recipes.put(CoffeeType.HOT_WATER, new Recipe(CoffeeType.HOT_WATER, List.of(new RecipeItem("Hot Water", 5))));
    }

    @Override
    public CoffeeMenu getCoffeeMenu() {
        List<Coffee> menu = coffeeTypes.stream()
        .map(type -> new Coffee(type.getDisplayName(), type.getPrice()))
        .collect(Collectors.toList());

        return new CoffeeMenu(menu);
    }

    @Override
    public Recipe prepareCoffee(Order order) {
        Recipe recipe = getRecipe(order.getCoffeeType());
        return recipe;
    }

    private Recipe getRecipe(CoffeeType coffeeType) {
        Recipe recipe = recipes.get(coffeeType);
        if (recipe == null) {
            throw new InvalidCoffeeTypeException("Invalid coffee type: " + coffeeType);
        }
        return recipe;
    }
}


