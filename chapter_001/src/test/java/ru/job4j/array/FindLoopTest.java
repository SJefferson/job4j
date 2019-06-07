package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }


    @Test
    public void whenArrayHas13Then6() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 4, 6, 7, 4, 15, 13};
        int value = 13;
        int result = find.indexOf(input, value);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {10, 20, 3, 1};
        int value = 1;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

}
