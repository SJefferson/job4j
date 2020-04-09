package ru.job4j.condition;

public class Max {
    public int max(int first, int second) {
     int result;
     result = first > second ? first : second;
     return result;
    }

    public int max(int first, int second, int third) {
        int result0, result;
        result = max(max(first,second), third);
        return result;
    }

    public  int max(int fitst, int second, int third, int fourth){
        int result;
        result = max(max(fitst,second), max(third,fourth));
        return result;
    }

}
