package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char x = 'X';
                if (board[row][j] != x) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char x = 'X';
                if (board[i][column] != x) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
