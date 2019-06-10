package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean firstDiag = true, secondDiag = true;
        for (int diag = 0; diag != 2; diag++) {
            if (diag == 1) {
               boolean b = data[data[0].length][0];
                for (int tekDiag = 0; tekDiag != data[0].length; tekDiag++) {
                    if (b != data[data[0].length - tekDiag][tekDiag]) {
                        secondDiag = false;
                    }
                }

                //if (b != data[tekDiag][tekDiag]) {
                //    boolean firstDiag = false;
                // boolean b = data[0][0];
            }
            boolean b = data[0][0];
            for (int tekDiag = 0; tekDiag != data[0].length; tekDiag++) {
                if (b != data[tekDiag][tekDiag]) {
                    firstDiag = false;
                }
            }
        }
if (firstDiag != secondDiag) {
            result = false;
}


        return result;
    }
}