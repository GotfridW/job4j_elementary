package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = !name.isEmpty() && isLowerCase(name.charAt(0));
        if (result) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!(isDigit(code) || isSpecialSymbol(code)
                        || isUpperLatinLetter(code) || isLowerLatinLetter(code))) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
