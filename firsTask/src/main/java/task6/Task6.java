package task6;

/**
 * Написать программу нахождения суммы большего и меньшего из трех чисел.
 */
public class Task6 {

    public double maxNumber(double a, double b, double c) {
        if (a > b && a > c) return a;
        else if (b > c && b > a) return b;
        else return c;
    }

    public double minNumber(double a, double b, double c) {
        if (a < b && a < c) return a;
        else if (b < c && b < a) return b;
        else return c;
    }

    public double sum(double a, double b){
        return a + b;
    }
}
