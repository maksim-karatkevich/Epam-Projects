package task5;

/**
 * Даны три действительных числа.
 * Возвести в квадрат те из них, значения которых неотрицательны,
 * и в четвертую степень — отрицательные.
 */
public class Runner {
    public static void main(String[] args) {
        int a = 1;
        int b = -2;
        int c = 3;

        System.out.println(Task5.raisedToThePower(a));
        System.out.println(Task5.raisedToThePower(b));
        System.out.println(Task5.raisedToThePower(c));

    }
}
