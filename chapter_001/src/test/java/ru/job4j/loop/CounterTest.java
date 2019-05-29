package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter loop = new Counter();
        int s = loop.add(1, 10);
        assertThat(s, is(30));
    }
}