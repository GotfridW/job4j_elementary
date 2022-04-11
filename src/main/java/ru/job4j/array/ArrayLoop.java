package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] figures = new int[5];
        for (int index = 0; index < figures.length; index++) {
            figures[index] = index * 2 + 3;
        }
        for (int figure : figures) {
            System.out.println(figure);
        }
    }
}
