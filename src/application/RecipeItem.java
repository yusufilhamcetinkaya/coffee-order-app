package application;

/**
 * Represents an ingredient and its quantity in a recipe.
 */
public class RecipeItem {
    private String ingredient;
    private int amount;

    public RecipeItem(String ingredient, int amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public String getIngredient() {
        return ingredient;
    }

    public int getAmount() {
        return amount;
    }
}

