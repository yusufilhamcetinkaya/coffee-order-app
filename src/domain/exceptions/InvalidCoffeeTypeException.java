package domain.exceptions;

public class InvalidCoffeeTypeException extends RuntimeException {
    public InvalidCoffeeTypeException(String message) {
        super(message);
    }
}
