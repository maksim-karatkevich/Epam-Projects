package task6;


public class Runner {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        double a = task6.maxNumber(333, 1, 12);
        double b = task6.minNumber(333, 1, 12);
        System.out.println(task6.sum(a, b));

    }
}
