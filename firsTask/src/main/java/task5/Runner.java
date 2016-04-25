package task5;

/**
 * Даны три действительных числа.
 * Возвести в квадрат те из них, значения которых неотрицательны,
 * и в четвертую степень — отрицательные.
 */
public class Runner {
    public static void main(String[] args) {
            Task5 task5 = new Task5(15, 35, -22);
            task5.print();
    }
}
