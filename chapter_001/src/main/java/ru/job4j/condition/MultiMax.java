package ru.job4j.condition;

public class MultiMax {
    /**
     * Возврат максимального из 3 чисел.
     * @param first  Первое сравниваемое число.
     * @param second Второе сравниваемое число.
     * @param third  Третье сравниваемое число.
     * @return Ответ.
     */
    public int maxThree(int first, int second, int third) {
        int result = first;
        result = result > second ? result : second;
        result = result > third ? result : third;
        return result;
    }
}
