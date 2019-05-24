package ru.job4j.sqarea;

/**
 * Расчет площади прямоугольника.
 */

public class SqArea {

    /**
     * Расчитываем ширину.
     * @param per периметр.
     * @param k коэфициент.
     * @return ширина.
     */
    public int with(int per, int k) {
        return per / (2 + (2 * k));
    }

    /**
     * Расчитываем длину.
     * @param per периметр.
     * @param k коэфициент.
     * @return ширина.
     */
        public int height(int per, int k) {
        return per * k / (2 + (2 * k));
    }

    /**
     * Расчитываем длину.
     * @param per периметр.
     * @param k коэфициент.
     * @return ширина.
     */
    public int square(int per, int k) {
        return (per * k / (2 + (2 * k))) * (per / (2 + (2 * k)));
    }


}
