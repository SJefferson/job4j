package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {

        if (array.length % 2 == 0) {
            int mid = array.length / 2;
            for (int index = 0; index != mid; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
            }
        }

        if (array.length % 2 != 0) {
            int mid = (array.length - 1) / 2;
            for (int index = 0; index != mid; index++) {
                int temp = array[index];
                array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
            }
        }
        return array;
    }
}