package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean firstDiag = true, secondDiag = true;
        for (int diag = 0; diag != 2; diag++) {
            if (diag != 1) {
            boolean b = data[0][0];
            for (int tekDiag = 0; tekDiag != data[0].length; tekDiag++) {
                if (b != data[tekDiag][tekDiag]) {
                    firstDiag = false;
                    break;
                }
            }
            } else {
                int a = data[0].length - 1;
               boolean b = data[a][0];
                for (int tekDiag = 0; tekDiag != data[0].length; tekDiag++) {
                    if (b != data[data[0].length - 1 - tekDiag][tekDiag]) {
                        secondDiag = false;
                        break;
                    }
                }
            }

        }

        if ((!firstDiag) || (!secondDiag)) {
            result = false;
        }


        return result;
    }
}