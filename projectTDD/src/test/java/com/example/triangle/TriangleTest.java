package com.example.triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    void scaleneValid() {
        assertEquals("SCALENE", Triangle.classify(3, 4, 5));
    }

    @Test
    void isoscelesValid() {
        assertEquals("ISOSCELES", Triangle.classify(5, 5, 3));
    }

    @Test
    void equilateralValid() {
        assertEquals("EQUILATERAL", Triangle.classify(4, 4, 4));
    }

    @Test
    void isoscelesPermutation1() {
        assertEquals("ISOSCELES", Triangle.classify(5, 5, 3));
    }

    @Test
    void isoscelesPermutation2() {
        assertEquals("ISOSCELES", Triangle.classify(5, 3, 5));
    }

    @Test
    void isoscelesPermutation3() {
        assertEquals("ISOSCELES", Triangle.classify(3, 5, 5));
    }

    @Test
    void zeroValue() {
        assertEquals("INVALID", Triangle.classify(0, 4, 5));
    }

    @Test
    void negativeValue() {
        assertEquals("INVALID", Triangle.classify(-1, 4, 5));
    }

    @Test
    void sumEqualsThirdPermutation1() {
        assertEquals("INVALID", Triangle.classify(1, 2, 3));
    }

    @Test
    void sumEqualsThirdPermutation2() {
        assertEquals("INVALID", Triangle.classify(2, 3, 1));
    }

    @Test
    void sumEqualsThirdPermutation3() {
        assertEquals("INVALID", Triangle.classify(3, 1, 2));
    }

    @Test
    void sumLessThanThirdPermutation1() {
        assertEquals("INVALID", Triangle.classify(1, 2, 4));
    }

    @Test
    void sumLessThanThirdPermutation2() {
        assertEquals("INVALID", Triangle.classify(2, 4, 1));
    }

    @Test
    void sumLessThanThirdPermutation3() {
        assertEquals("INVALID", Triangle.classify(4, 1, 2));
    }

    @Test
    void allZeros() {
        assertEquals("INVALID", Triangle.classify(0, 0, 0));
    }
}