# Coffee Ordering App

This project demonstrates a coffee ordering application implemented in Java. The application provides users with a menu of predefined coffee types to choose from, and it guides them through the process of selecting and preparing their desired coffee.

## Purpose

The main purpose of this project is to showcase how to develop a well-structured Java application that adheres to clean code practices and follows the principles of clean architecture. It serves as an educational example for developers looking to learn about writing clean and maintainable code in Java.

## Features

- Predefined coffee types and their prices are stored in the system.
- Users can view the list of available coffee types and their prices.
- Users can select a coffee type and receive a message indicating that their coffee is being prepared.
- Each coffee type's recipe is displayed, including the required ingredients and quantities.

## Project Directory Structure

Here's the directory structure of the project: 
```bash 
             src/
                ├── application/
                │   ├── CoffeeApp.java
                │   ├── CoffeeMenu.java
                │   ├── CoffeeType.java
                │   ├── Order.java
                │   ├── Recipe.java
                │   └── RecipeItem.java
                ├── domain/
                │   ├── exceptions/
                │   │   └── InvalidCoffeeTypeException.java
                │   └── model/
                │       └── Coffee.java
                └── service/
                    ├── CoffeeService.java
                    └── CoffeeServiceImpl.java
```

In this structure:
- `application` contains the application entry point and user interface related code.
- `domain` contains domain logic, including exceptions and the main model classes.
- `service` contains the service interface and implementation.


## Installation

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile and run the `CoffeeApp.java` file to start the application.

## Usage

1. Launch the application.
2. View the list of available coffee types and prices.
3. Enter the number of the desired coffee type.
4. Follow the on-screen instructions to complete the order.
5. After each order, you'll be prompted whether you want to make another order or exit the application.

## Technologies Used

- Java 8+
- JUnit and Mockito for unit testing
- Git for version control

## Clean Code and Architecture

This project follows the principles of clean code, emphasizing readability, maintainability, and best practices in code organization. It also adheres to clean architecture concepts, separating concerns and providing a clear structure for the application's layers.
