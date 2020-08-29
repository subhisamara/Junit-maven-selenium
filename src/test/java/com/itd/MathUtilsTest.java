package com.itd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils mathUtils;


    @BeforeEach
    void initEach() {
        mathUtils = new MathUtils();
    }

    @Nested
    public class AddTest {
        @Test
        public void testAddingTwoPositives() {
            assertEquals(2, mathUtils.add(1, 1),
                    "Add method should return the sum of two numbers");
        }

        @Test
        public void testAddingTwoNegatives() {
            assertEquals(-2, mathUtils.add(-1, -1),
                    "Add method should return the sum of two numbers");
        }

        @Test
        public void testAddingAPositiveAndANegative() {
            assertEquals(0, mathUtils.add(-1, 1),
                    "Add method should return the sum of two numbers");
        }
    }

    @Test
    public void testMultiply() {
        assertAll(
                () -> assertEquals(0, mathUtils.multiply(1, 0)),
                () -> assertEquals(1, mathUtils.multiply(1, 1)),
                () -> assertEquals(6, mathUtils.multiply(2, 3))
        );
    }

    @Test
    public void computeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),
                "Should return right circle area");
    }

    @Test
    public void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),
                "Divide should throw ArithmeticException when denominator is zero");
    }

}