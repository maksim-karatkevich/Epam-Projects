package task1;

/**
 * Created by maksim_kevich on 4/19/16.
 */
public class Runner {
    public static void main(String[] args) throws Exception {
        try {
            Task1 t = new Task1(args[0]);
        } catch (Exception ex){
            System.out.println(ex);
        }

    }
}
