package ru.job4j.calculator;

public class Fit {
    public static float manWeight(short height) {
        return (float) ((height - 100) * 1.15);
    }

    public static float womanWeight(short height) {
        return (float) ((height - 110) * 1.15);
    }

    public static void main(String[] args) {
        float man = Fit.manWeight((short) 194);
        float woman = Fit.womanWeight((short) 165);
        System.out.println("Man 194 is " + man);
        System.out.println("Woman 165 is " + woman);
    }
}
