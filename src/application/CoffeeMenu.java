package application;

import domain.model.Coffee;

import java.util.List;

public class CoffeeMenu {
    private List<Coffee> coffees;

    public CoffeeMenu(List<Coffee> coffees) {
        this.coffees = coffees;
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }
}

