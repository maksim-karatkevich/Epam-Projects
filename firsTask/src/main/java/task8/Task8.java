package task8;

/**
 * В массив A [N] занесены натуральные числа.
 * Найти сумму тех элементов, которые кратны данному К.
 */
public class Task8 {

    public static int sum(int[] a, int k){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % k == 0){
                sum += a[i];
            }
        }
        return sum;
    }
}
