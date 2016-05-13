package task10;

import java.util.Arrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task10 {
    public static int[][] getMatrix(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < res.length; i++) {
            if (i % 2 != 0) {
                fillN(res, i);
            } else {
                for (int j = 0; j < res.length; j++) {
                    res[i][j] = j + 1;
                }
            }
        }
        return res;
    }

    private static int[][] fillN(int[][] res, int i) {
        int temp = res.length;
        for (int j = 0; j < res.length; j++) {
            res[i][j] = temp;
            temp--;
        }
        return res;
    }

    public static void printRes(int[][] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}

