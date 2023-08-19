package service;

import application.CoffeeMenu;
import application.Order;
import application.Recipe;

public interface CoffeeService {
    CoffeeMenu getCoffeeMenu();

    Recipe prepareCoffee(Order order);
}

