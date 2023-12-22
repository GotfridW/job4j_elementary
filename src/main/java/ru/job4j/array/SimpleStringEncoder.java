package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result = concatenated(result, symbol, counter);
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        return concatenated(result, symbol, counter);
    }

    private static String concatenated(String input, char symbol, int counter) {
        return input + symbol + (counter > 1 ? counter : "");
    }
}
