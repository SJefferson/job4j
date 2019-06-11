package ru.job4j.array;

import java.util.Arrays;

/**
 *Удаление дубликатов
 */

public class ArrayDublicate {

    public String[] remover(String[] array) {
        int unDubl = array.length;
        for (int out = 0; out < unDubl; out++) {
            for (int in = out + 1; in < unDubl; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unDubl - 1];
                    unDubl--;
                    in--;


                   /* String dubl = array[out];
                    array[out] = array[unDubl - 1];
                    array[unDubl - 1] = dubl;
                   //array[in] = array[unDubl - 1];
                   unDubl--;
                   in--;*/
                }
            }

        }
        return Arrays.copyOf(array, unDubl);

    }

}
