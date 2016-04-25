package task7;

import java.util.Arrays;

/**
 * Created by maksim_kevich on 4/20/16.
 */
public class Runner {
    public static void main(String[] args) {
        Task7 func=new Task7();
        double[][] d  = func.createTableResult(3, 0, 9);
        for (int i = 0; i < d.length; i++) {
            System.out.println(Arrays.toString(d[i]));
        }

    }
}
