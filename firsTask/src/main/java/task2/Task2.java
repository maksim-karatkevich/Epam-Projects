package task2;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */

public class Task2 {
    double a, b, c;

    public Task2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b,2) + 4 * a * c;
    }

    public double getResult() {
        return (b + Math.sqrt(getDiscriminant())) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b,-2);
    }
}
