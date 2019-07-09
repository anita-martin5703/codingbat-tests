package edu.cnm.deepdive;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class Array2Test {

    Array2 array = new Array2();

    static Object[][] input = {
            {new int[]{1, 2, 2}, true},
            {new int[]{4, 4, 1}, true},
            {new int[]{4, 4, 1, 2, 2}, false},
            {new int[]{1, 2, 3, 4}, false},
            {new int[]{3, 5, 9}, false},
            {new int[]{1, 2, 3, 4, 4}, true},
            {new int[]{2, 2, 3, 4}, true},
            {new int[]{1, 2, 3, 2, 2}, true},
            {new int[]{1, 2, 3, 2, 2, 4, 4}, false},
            {new int[]{1, 2}, false},
            {new int[]{2, 2}, true},
            {new int[]{4, 4}, true},
            {new int[]{2}, false},
            {new int[]{}, false}
    };

    private static Object[][] either24() {
        return input;
    }

    @ParameterizedTest
    @MethodSource
    void either24(int[] nums, boolean expected) {
        boolean actual = array.either24(nums);
        if (expected) {
            assertTrue(actual);
        } else {
            assertFalse(actual);
        }
    }


    static Object[][] input2 = {
            {new int[]{1, 2, 4, 1}, new int[]{1, 2}},
            {new int[]{3, 1, 4}, new int[]{3, 1}},
            {new int[]{1, 4, 4}, new int[]{1}},
            {new int[]{1, 4, 4, 2}, new int[]{1}},
            {new int[]{1, 3, 4, 2, 4}, new int[]{1, 3}},
            {new int[]{4, 4}, new int[]{}},
            {new int[]{3, 3, 4}, new int[]{3, 3}},
            {new int[]{1, 2, 1, 4}, new int[]{1, 2, 1}},
            {new int[]{2, 1, 4, 2}, new int[]{2, 1}},
            {new int[]{2, 1, 2, 1, 4, 2}, new int[]{2, 1, 2, 1}},
    };

    private static Object[][] pre4() {
        return input2;
    }

    @ParameterizedTest
    @MethodSource
    void pre4(int[] nums, int[] expected) {
        int[] actual = array.pre4(nums);
        assertArrayEquals(expected, actual);

     }
}