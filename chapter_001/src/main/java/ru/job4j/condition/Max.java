package ru.job4j.condition;

public class Max {
    public int max(int first, int second) {
     int result;
     result = first > second ? first : second;
     return result;
    }

    public int Max(int first, int second, int third) {
        int result0, result;
        result0 = first > second ? first : second;
        result = result0 > third ? result0 : third;
        return result;
    }

    public  int Max(int fitst, int second, int third, int fourth){
        int result;
        result = Max(fitst,second,third) > fourth ? Max(fitst,second,third) : fourth;
        return result;
    }

}
