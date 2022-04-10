package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int div = 2; div <= number / 2; div++) {
            if (number % div == 0) {
                prime = false;
                break;
            }
        }
        if (number == -1 || number == 1) {
            prime = false;
        }
        return prime;
    }
}

