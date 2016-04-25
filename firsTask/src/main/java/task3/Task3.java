package task3;

/**
 * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов
 */

public class Task3 {
    double a, b;

    public Task3(double a, double b) throws Exception {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter() {
        return (a + b) + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public double getArea() {
        return a * (b / 2);
    }


}
