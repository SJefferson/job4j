package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean b = data[0];
        for (int out = 0; out != data.length; out++) {
            if (b != data[out]) {
                result = false;
                break;
            }
        }
        return result;
    }
}