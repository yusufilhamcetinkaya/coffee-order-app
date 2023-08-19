package application;

/**
 * Represents a coffee order, containing the selected coffee type.
 */
public class Order {
    private CoffeeType coffeeType;

    public Order(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }
}

