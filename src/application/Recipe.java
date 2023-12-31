package application;

import java.util.List;

/**
 * Represents a recipe for a specific coffee type, containing a list of required recipe items.
 */
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



