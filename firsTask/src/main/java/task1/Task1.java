package task1;

/**
 * 1. Составить линейную программу, печатающую значение true,
 * если указанное высказывание является истинным, и false — в противном случае:
 * <p>
 * Сумма двух первых цифр заданного четырехзначного числа
 * равна сумме двух его последних цифр.
 */
public class Task1 {
    public Task1(String number) throws Exception {
        if (number.contains(".")) {
            String temp = number.replace('.', ' ').replaceAll(" ", "");
            number = temp;
        }

        if (number.length() > 4 || number.length() < 0) {
            throw new Exception("The number must be 4 digits");
        }
        print(number);
    }

    public boolean sum(String number) throws NumberFormatException {
        int s = Integer.parseInt(String.valueOf(number.charAt(0)));
        int s2 = Integer.parseInt(String.valueOf(number.charAt(1)));
        int s3 = Integer.parseInt(String.valueOf(number.charAt(number.length() - 1)));
        int s4 = Integer.parseInt(String.valueOf(number.charAt(number.length() - 2)));
        if (s + s2 == s3 + s4) {
            return true;
        } else return false;

    }

    public void print(String number) {
        try {
            System.out.println(sum(number));
        } catch (NumberFormatException ex) {
            System.out.println("Must be only numbers");
        }
    }
}
