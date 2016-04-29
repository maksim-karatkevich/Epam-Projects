package task3;

/**
 * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов
 */

public class Task3 {

    public static double getPerimeter(double a, double b) {
        return (a + b) + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public static double getArea(double a, double b) {
        return a * (b / 2);
    }


}
