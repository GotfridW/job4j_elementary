package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight((short) 194);
        double woman = Fit.womanWeight((short) 165);
        System.out.println("Man 194 is " + man);
        System.out.println("Woman 165 is " + woman);
    }
}
