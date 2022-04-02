package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 95;
    }

    public static float euroToRuble(float value) {
        return value * 95;
    }

    public static float rubleToDollar(float value) {
        return value / 86;
    }

    public static float dollarToRuble(float value) {
        return value * 86;
    }

    public static float euroToDollar(float value) {
        return (float) (value * 1.1);
    }

    public static float dollarToEuro(float value) {
        return (float) (value * 0.9);
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(190);
        float euroToRub = Converter.euroToRuble(50);
        float dollar = Converter.rubleToDollar(200);
        float dollarToRub = Converter.dollarToRuble(500);
        float eurToUsd = Converter.euroToDollar(35);
        float usdToEuro = Converter.dollarToEuro(10);
        System.out.println("190 rubles are " + euro + " euro.");
        System.out.println("50 euro are " + euroToRub + " rubles");
        System.out.println("200 rubles are " + dollar + " dollars");
        System.out.println("500 dollars are " + dollarToRub + " rubles");
        System.out.println("35 euro are " + eurToUsd + " dollars");
        System.out.println("10 dollars are " + usdToEuro + " euro");
    }
}
