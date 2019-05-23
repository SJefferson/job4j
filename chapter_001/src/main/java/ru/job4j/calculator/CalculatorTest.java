package ru.job4j.calculator;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtracktSevenAndFive() {
        Calculator calc = new Calculator();
        double result = calc.subtrackt(7,5.22);
        double expected = 1.78;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivide16By3Point5(){
        Calculator calc = new Calculator();
        double result = calc.divide(16,3.5);
        double expected = 4.5714;
        assertThat(result,is(expected));
    }

    @Test
    public void whenMultiply3P8By5P9(){
        Calculator calc = new Calculator();
        double result = calc.multiply(3.8,5.9);
        double expected = 22.42;
        assertThat(result,is(expected));
    }
}