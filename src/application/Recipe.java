package application;

import java.util.List;

public class Recipe {
    private CoffeeType coffeeType;
    private List<RecipeItem> recipeItems;

    public Recipe(CoffeeType coffeeType, List<RecipeItem> recipeItems) {
        this.coffeeType = coffeeType;
        this.recipeItems = recipeItems;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public List<RecipeItem> getRecipeItems() {
        return recipeItems;
    }
}



