package application;

public class Order {
    private CoffeeType coffeeType;

    public Order(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }
}

