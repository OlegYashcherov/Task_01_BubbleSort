package com.olegyashcherov.bubble_sort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final int SIZE_ARRAY = 20;

    public static void main(String[] args) {
        int[] array = new int[SIZE_ARRAY];
        Random random = new Random();

        //Генерация массива со случайными числами. Числа могут повторяться
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Начальный массив");
        printArray(array);

        System.out.println("\nЭтапы сортировки:");
        //Сортировка пузырьком
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
            printArray(array);
        }

    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}