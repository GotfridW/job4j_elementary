package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = word.length - post.length; i < word.length; i++) {
            for (char j : post) {
                result = word[i] == j;
            }
        }
        return result;
    }
}
