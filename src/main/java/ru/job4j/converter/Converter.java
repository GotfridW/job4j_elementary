package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 95; }

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

        float in = 190;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("190 rubles are 2. Test result : " + passed);

        in = 5;
        expected = 475;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("5 euro are 475. Test result : " + passed);

        in = 860;
        expected = 10;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("860 rubles are 10. Test result : " + passed);

        in = 25;
        expected = 2150;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("25 dollars are 2150. Test result : " + passed);

        in = 13;
        expected = 14.3f;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("13 euro are 14.30. Test result : " + passed);

        in = 55;
        expected = 49.5f;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("55 dollars are 49.50. Test result : " + passed);

    }
}
