package domain.exceptions;

/**
 * Custom exception class representing an invalid coffee type selection.
 */
public class InvalidCoffeeTypeException extends RuntimeException {
    public InvalidCoffeeTypeException(String message) {
        super(message);
    }
}
