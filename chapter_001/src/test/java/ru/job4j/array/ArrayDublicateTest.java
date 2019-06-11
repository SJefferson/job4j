package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.*;



public class ArrayDublicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"1", "3", "2", "1", "4", "2"};
        String[] expecect = {"1", "3", "2", "4"};
        ArrayDublicate array = new ArrayDublicate();
        String[] result = array.remover(input);
        assertThat(result, arrayContainingInAnyOrder(expecect));
    }
}




