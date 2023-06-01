package org.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CalculationsTest {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        return (double) num1 / (double) num2;
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(5, add(2, 3));
        Assertions.assertEquals(-1, add(2, -3));
        Assertions.assertEquals(0, add(0, 0));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(-1, subtract(2, 3));
        Assertions.assertEquals(5, subtract(2, -3));
        Assertions.assertEquals(0, subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(6, multiply(2, 3));
        Assertions.assertEquals(-6, multiply(2, -3));
        Assertions.assertEquals(0, multiply(0, 0));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(0.6666666666666666, divide(2, 3), 0.00001);
        Assertions.assertEquals(-0.6666666666666666, divide(2, -3), 0.00001);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, divide(5, 0));
    }
}
