package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int div = 2; div <= number / 2; div++) {
            if (number % div == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

