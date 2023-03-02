package Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getA() {
       Calculator c1 = new Calculator(10, 5);
        double results = c1.getA();

        Assertions.assertEquals(10, results);
    }

    @Test
    void getB() {
        Calculator c1 = new Calculator(10, 5);
        double results = c1.getB();

        Assertions.assertEquals(5, results);
    }

    @Test
    void saberi() {
        Calculator c1 = new Calculator(10, 5);
        double results = c1.saberi();

        Assertions.assertEquals(15, results);
    }

    @Test
    void oduzmi() {
        Calculator c1 = new Calculator(10, 5);
        double results = c1.oduzmi();

        Assertions.assertEquals(5, results);
    }

    @Test
    void podeli() {
        Calculator c1 = new Calculator(10, 5);
        double results = c1.podeli();

        Assertions.assertEquals(2, results);
    }

}