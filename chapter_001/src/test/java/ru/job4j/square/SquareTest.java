package ru.job4j.square;

import org.junit.Test;
import ru.job4j.sqarea.SqArea;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void p4k1s1() {
        SqArea sq = new SqArea();
        int with1 = sq.square(4, 1);
        assertThat(with1, is(1));
    }

    @Test
    public void p6k1s1() {
        SqArea sq = new SqArea();
        int with1 = sq.square(6, 2);
        assertThat(with1, is(2));
    }
}
