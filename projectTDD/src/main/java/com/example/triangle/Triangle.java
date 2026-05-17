package com.example.triangle;

public class Triangle {

    public static String classify(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return "INVALID";

        if (a + b <= c || a + c <= b || b + c <= a) return "INVALID";

        if (a == b && b == c) return "EQUILATERAL";

        if (a == b || a == c || b == c) return "ISOSCELES";

        return "SCALENE";
    }
}