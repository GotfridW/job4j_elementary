package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int symbols = 0; symbols < pref.length; symbols++) {
            if (word[symbols] != pref[symbols]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
