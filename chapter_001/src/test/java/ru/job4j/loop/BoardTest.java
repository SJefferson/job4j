package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Rinat Kudabaev (Kudabaevrm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {

    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
    }

    @Test
    public void when4x5() {
        Board board = new Board();
        String rsl = board.paint(4, 5);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X X\r\n X X \r\nX X X\r\n X X \r\n")
                )
        );
    }
}