package org.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumDoubleTest {

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    @Test
    public void testSumDouble() {
        Assertions.assertEquals(3, sumDouble(1, 2));
        Assertions.assertEquals(5, sumDouble(3, 2));
        Assertions.assertEquals(8, sumDouble(2, 2));
        Assertions.assertEquals(7, sumDouble(4, 3));
    }
}

