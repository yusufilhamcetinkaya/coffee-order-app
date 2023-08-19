package application;

import domain.model.Coffee;

import java.util.List;

/**
 * Represents the coffee menu containing a list of available coffee types with their names and prices.
 */
public class CoffeeMenu {
    private List<Coffee> coffees;

    public CoffeeMenu(List<Coffee> coffees) {
        this.coffees = coffees;
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }
}

