package application;

/*
 * Enum representing different types of coffee along with their display names and prices.
 */
public enum CoffeeType {
    ESPRESSO("Espresso", 20),
    DOUBLE_ESPRESSO("Double Espresso", 29),
    CAPPUCCINO("Cappuccino", 27),
    CAFFE_LATTE("Caffe Latte", 27),
    MOCHA("Mocha", 32),
    AMERICANO("Americano", 25),
    HOT_WATER("Hot Water", 5);

    private String displayName;
    private int price;

    CoffeeType(String displayName, int price) {
        this.displayName = displayName;
        this.price = price;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getPrice() {
        return price;
    }
}
