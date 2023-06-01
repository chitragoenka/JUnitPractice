package org.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommonEndTest {

    @Test
    public void testCommonEnd_FirstElementsMatch() {
        int[] a = {1, 2, 3};
        int[] b = {1, 4, 5};
        assertTrue(CommonEnd.commonEnd(a, b));
    }

    @Test
    public void testCommonEnd_LastElementsMatch() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 3};
        assertTrue(CommonEnd.commonEnd(a, b));
    }

    @Test
    public void testCommonEnd_NoCommonEnds() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        assertFalse(CommonEnd.commonEnd(a, b));
    }

    @Test
    public void testCommonEnd_EmptyArrays() {
        int[] a = {};
        int[] b = {};
        assertFalse(CommonEnd.commonEnd(a, b));
    }

    @Test
    public void testCommonEnd_EmptyFirstArray() {
        int[] a = {};
        int[] b = {1, 2, 3};
        assertFalse(CommonEnd.commonEnd(a, b));
    }

    @Test
    public void testCommonEnd_EmptySecondArray() {
        int[] a = {1, 2, 3};
        int[] b = {};
        assertFalse(CommonEnd.commonEnd(a, b));
    }
}

