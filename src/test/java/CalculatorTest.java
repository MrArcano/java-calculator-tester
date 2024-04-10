import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @AfterAll
    static void afterAll() {

    }

    @Test
    void add() {
        assertEquals(1.5f, Calculator.add(1f,0.5f),0.00001);
    }

    @Test
    void subtract() {
        assertEquals(0.8f, Calculator.subtract(3f,2.2f),0.00001);
    }

    @Test
    void divide() {
        assertEquals(3.1f, Calculator.divide(6.2f,2.0f));
    }

    @Test
    void divideThrow() {
        assertThrows(IllegalArgumentException.class ,() -> Calculator.divide(5,0));
    }

    @Test
    void multiply() {
        assertEquals(12.4f, Calculator.multiply(6.2f,2.0f));
    }
}