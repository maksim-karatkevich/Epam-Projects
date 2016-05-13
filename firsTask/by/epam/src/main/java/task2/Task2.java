package task2;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

public class Task2 {


    public static double getDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) + 4 * a * c;
    }

    public static double getResult(double a, double b, double c) {
        return (b + Math.sqrt(getDiscriminant(a, b, c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
