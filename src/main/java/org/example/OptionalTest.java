package org.example;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        try {
            Double result = divideByXMinusOne(1.0).orElseThrow(() -> {
                System.out.println("División por cero no permitida");
                return new ArithmeticException("División por cero no permitida");
            });
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Se lanzó una excepción: " + e.getMessage());
        }

        System.out.println(divideByXMinusOne(2.0)); // Output: Optional[5.0]
        System.out.println(divideByXMinusOne(1.0)); // Output: Optional.empty
        System.out.println(divideByXMinusOne(0.0)); // Output: Optional[-5.0]
    }

    public static Optional<Double> divideByXMinusOne(Double x) {
        if (x == null || x == 1) {
            return Optional.empty(); // Retorna un Optional vacío si x es null o 1 (división por cero)
        }

        Double result = 5 / (x - 1);
        return Optional.of(result);
    }



}


