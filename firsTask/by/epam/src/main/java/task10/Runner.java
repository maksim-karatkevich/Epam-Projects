package task10;

/**
 * Created by maksim_kevich on 4/20/16.
 */
public class Runner {
    public static void main(String[] args) {
        Task10 task10 = new Task10();
        int[][] r = task10.getMatrix(10);
        task10.printRes(r);
    }
}
