package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(2, 1));
        System.out.println(Max.max(4, 6));
        System.out.println(Max.max(8, 8));
    }
}
