package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int n = start; n <= finish; n++) {
            sum = sum + n;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int n = start; n <= finish; n++) {
            if (n % 2 == 0) {
                sum = sum + n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(9, 89));
        System.out.println(sum(3, 13));
        System.out.println(sum(0, 15));
    }
}
