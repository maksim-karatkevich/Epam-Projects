package task5;

/**
 Даны три действительных числа.
 Возвести в квадрат те из них, значения которых неотрицательны,
 и в четвертую степень — отрицательные.
 */
public class Task5 {


    public static double raisedToThePower(double n){
        if (negativeOrNo(n)) return Math.pow(n, 2);
        else return Math.pow(n, 4);

    }
    public static boolean negativeOrNo(double n){
        if (n >= 0) return true;
        else return false;
    }
}
