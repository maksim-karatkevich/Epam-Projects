package task1;

/**
 * Created by maksim_kevich on 4/19/16.
 */
public class Runner {
    public static void main(String[] args) throws Exception {
        String number = "12.12";
        number = Task1.replaceDot(number);
        System.out.println(Task1.sum(number));
    }
}
