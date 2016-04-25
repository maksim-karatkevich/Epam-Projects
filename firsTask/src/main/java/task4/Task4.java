package task4;

/**
 * Для данных областей составить линейную программу,
 * которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 */

public class Task4 {

    public boolean getResult(int x, int y) {
        if (x > -3 && x < 3 && y < 5 && y > -1) {
            return true;
        } else if (x > -5 && x < 5 && y < -1 && y > -4){
            return true;
        } else return false;
    }
}
