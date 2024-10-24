/**
 * The Calculator class provides basic arithmetic operations.
 * This class supports addition, subtraction, multiplication,
 * and division of two numbers.
 */
public class Calculator {

    /**
     * Adds two numbers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first number.
     * 
     * @param a the first number
     * @param b the second number
     * @return the result of subtracting b from a
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second number.
     * If the second number is zero, an IllegalArgumentException is thrown.
     * 
     * @param a the first number
     * @param b the second number
     * @return the result of dividing a by b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
s