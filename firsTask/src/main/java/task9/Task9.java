package task9;

/**
 * Заданы два одномерных массива с различным количеством элементов
 * и натуральное число k. Объединить их в один массив,
 * включив второй массив между k-м и (k+1) - м элементами первого.
 */
public class Task9 {
    int[] mas;
    int[] mas2;

    public Task9(int[] mas, int[] mas2) {
        this.mas = mas;
        this.mas2 = mas2;
    }

    public int[] copyArrays(int k) {
        int numOfElements = mas.length + mas2.length;
        int i = 0;
        int temp = 0;
        int[] result = new int[numOfElements];
        for (i = 0; i < k; i++) {
            result[i] = mas[i];
        }
        temp = i;
        copyMiddlePart(result, i, temp);


        return result;
    }

    private void copyMiddlePart(int[] result, int temp, int i) {
        for (int j = 0; j < mas2.length; j++) {
            result[i] = mas2[j];
            i++;
        }
        copyLastPart(result, i, temp);
    }


    private void copyLastPart(int[] result, int temp, int i) {
        for (int j = temp; j < result.length; j++) {
            result[j] = mas[i];
            i++;
        }
    }

    public void printRes(int k){
        int[] res = copyArrays(k);
        for (int i : res){
            System.out.print(i + " ");
        }
    }
}
