package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To1Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then1() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public  void Max3() {
        Max max = new Max();
        int result  = max.Max(4,3,5);
        assertThat(result, is(5));
    }


    @Test
    public  void Max4() {
        Max max = new Max();
        int result  = max.Max(7,3,5,4);
        assertThat(result, is(7));
    }
}
