package task9;

/**
 * Заданы два одномерных массива с различным количеством элементов
 * и натуральное число k. Объединить их в один массив,
 * включив второй массив между k-м и (k+1) - м элементами первого.
 */
public class Task9 {


    public static int[] copyArrays(int k, int[] a, int[] b) {
        int numOfElements = a.length + b.length;
        int i = 0;
        int temp = 0;
        int[] result = new int[numOfElements];
        for (i = 0; i < k; i++) {
            result[i] = a[i];
        }
        temp = i;
        copyMiddlePart(result, i, temp, a, b);


        return result;
    }

    private static void copyMiddlePart(int[] result, int temp, int i, int[] a, int[] b) {
        for (int j = 0; j < b.length; j++) {
            result[i] = b[j];
            i++;
        }
        copyLastPart(result, i, temp, a);
    }


    private static void copyLastPart(int[] result, int temp, int i, int[] a) {
        for (int j = temp; j < result.length; j++) {
            result[j] = a[i];
            i++;
        }
    }

    public static void printRes(int k, int[] a, int[] b) {
        int[] res = copyArrays(k, a, b);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
