package task5;

/**
 Даны три действительных числа.
 Возвести в квадрат те из них, значения которых неотрицательны,
 и в четвертую степень — отрицательные.
 */
public class Task5 {
    double a, b, c;

    public Task5(double a, double b, double c) {
        this.a = raisedToThePower(a);
        this.b = raisedToThePower(b);
        this.c = raisedToThePower(c);
    }

    public double raisedToThePower(double n){
        if (negativeOrNo(n)) return Math.pow(n, 2);
        else return Math.pow(n, 4);

    }
    public boolean negativeOrNo(double n){
        if (n >= 0) return true;
        else return false;
    }
    public void print(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}
