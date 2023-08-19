package service;

import application.CoffeeMenu;
import application.Order;
import application.Recipe;

/**
 * Defines the contract for the coffee service, providing methods for preparing coffee and getting the coffee menu.
 */
public interface CoffeeService {
    CoffeeMenu getCoffeeMenu();
     
    /**
     * Prepares the specified coffee order by generating its recipe and associated details.
     *
     * @param order The coffee order.
     * @return The recipe and details for the prepared coffee.
     */
    Recipe prepareCoffee(Order order);
}

