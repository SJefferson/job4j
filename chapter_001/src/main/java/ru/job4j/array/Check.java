package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        boolean b = data[0];
        for (int out = 0; out != 3; out++) {
            if (b == data[out]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}