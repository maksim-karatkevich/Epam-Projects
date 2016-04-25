package task7;

import task8.Main;

/**
 * Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h.
 * Результат представить в виде таблицы, первый столбец которой – значения  аргумента,
 * второй - соот­ветствующие значения функции:
 */
public class Task7 {
    public double[][] createTableResult(double n, double a, double b) {
        double[][] res = new double[(int) (b / n) ][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = a;
            res[i][1] = calcFunction(a);
            a = a + n;
            if (a > b)break;
        }
        return res;
    }

    public double calcFunction(double x) {
        double radian = Math.toRadians(x);
        double fx = (Math.pow(Math.sin(radian), 2)) - Math.cos(radian * 2);
        return fx;
    }

}
