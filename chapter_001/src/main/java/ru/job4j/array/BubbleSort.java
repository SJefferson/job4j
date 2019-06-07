package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] data) {
    boolean sorted = false;
    int buffer;

    while (!sorted) {
        sorted = true;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] > data[index + 1]) {
                sorted = false;
                buffer = data[index];
                data[index] = data[index + 1];
                data[index + 1] = buffer;
            }
        }
    }
    return data;
    }
}
