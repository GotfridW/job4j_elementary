package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 5);
        double result1 = Point.distance(15, 2, 32, 89);
        double result2 = Point.distance(6, 22, 41, 65);
        System.out.println("distance from (0, 0) to (2, 5) is " + result);
        System.out.println("distance from (15, 2) to (32, 89) is " + result1);
        System.out.println("distance from (6, 22) to (41, 65) is " + result2);
    }
}
