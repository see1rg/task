package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {21, 82, 77, 23, 34};
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        for (int x : array) {
            System.out.println(x);
        }
    }
}